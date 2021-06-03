import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Item> itemArr = new ArrayList<Item>();
        ArrayList<Order> orderArr = new ArrayList<Order>();

        Inventory inv = new Inventory();

        boolean menuTrig = true;
        boolean opMenuTrig = true;

        int arrIndex = 0;

        do {
            System.out.println("=========Inventory System========");
            System.out.println("Press 1 To Add Items To Inventory");
            System.out.println("Press 2 To Add Order");
            System.out.println("Press 3 To Show Inventory");
            System.out.println("Press 4 To Show Orders");
            System.out.println("Press 5 To Show All Details");
            System.out.println("Press 0 To Exit");

            byte menu = sc.nextByte();

            if (menu == 0) {
                menuTrig = false;
            }
            if (menu == 1) {
                byte subMenu;

                System.out.println("Select from The Following Options");
                System.out.println("=================================");
                System.out.println("Press 1 To Add Clothes");
                System.out.println("Press 2 To Add Cosmetics");
                System.out.println("Press 3 To Add Electronis");
                System.out.println("=================================");

                subMenu = sc.nextByte();

                if (subMenu == 1) {
                    String name;
                    double price;
                    int quantity;

                    System.out.println("=================================");
                    System.out.println("-------------Clothes-------------");
                    System.out.println("=================================");

                    System.out.print("Enter Name: ");
                    name = sc.next();

                    System.out.print("Enter Price: ");
                    price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();

                    itemArr.add(new Clothes(name, price, quantity));
                }
                if (subMenu == 2) {
                    String name;
                    double price;
                    int quantity;

                    System.out.println("=================================");
                    System.out.println("------------Cosmetics------------");
                    System.out.println("=================================");

                    System.out.print("Enter Name: ");
                    name = sc.next();

                    System.out.print("Enter Price: ");
                    price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();

                    itemArr.add(new Cosmetics(name, price, quantity));
                }
                if (subMenu == 3) {
                    String name;
                    double price;
                    int quantity;

                    System.out.println("=================================");
                    System.out.println("-----------Electronics-----------");
                    System.out.println("=================================");

                    System.out.print("Enter Name: ");
                    name = sc.next();

                    System.out.print("Enter Price: ");
                    price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();

                    itemArr.add(new Electronics(name, price, quantity));
                }
            }
            if (menu == 2) {
                {
                    byte orderPos;
                    byte orderMenu;
                    byte orderCount;
                    String[] orderHolder;
                    String productName;
                    int quantity;
                    do {

                        System.out.println("=================================");
                        System.out.println("------------Add Order------------");
                        System.out.println("=================================");
                        System.out.println("-------Available Products--------");
                        System.out.println("=================================");

                        for (Item item : itemArr) {
                            System.out.println(item.toString());
                        }

                        System.out.println("===================================");
                        System.out.println("Select From The Available Inventory");
                        System.out.println("===================================");

                        byte subMenu;
                        orderCount = 0;

                        orderHolder = new String[250];

                        String customerName;

                        System.out.print("Enter Customer Name: ");
                        customerName = sc.next();

                        System.out.print("Enter Product Name: ");
                        productName = sc.next();

                        System.out.print("Enter Quantity: ");
                        quantity = sc.nextInt();

                        for (Item item : itemArr) {
                            if (productName == item.name) {
                                if (quantity > item.quantity) {
                                    System.out.println("Error! Given Quantity Exceeds Inventory Quantity!!!");
                                    System.out.print("Enter Quantity: ");

                                    quantity = sc.nextInt();
                                }

                            }
                        }

                        System.out.println("=================================");
                        System.out.println("---------Order Completed---------");
                        System.out.println("=================================");

                        orderPos = 0;
                        Item itemOrdered = null;
                        double orderTotal = 0;
                        double checkItemPrice;

                        for (Item item : itemArr) {
                            orderPos += 1;
                            int bool = productName.compareToIgnoreCase(item.name);
                            if (bool == 0) {
                                orderTotal = item.price * quantity;
                                item.setQuantity(item.quantity - quantity);
                                itemOrdered = item;
                                break;
                            }
                        }

                        orderArr.add(new Order(customerName, orderTotal));
                        orderCount += 1;

                        orderArr.get(orderCount - 1).addItem(itemOrdered);

                        System.out.println("=================================");
                        System.out.println("----------Order Details----------");
                        System.out.println("=================================");

                        orderHolder[orderCount - 1] = "Product Name: " + (String) productName + " | Quantity: "
                                + quantity + " | Price Each: " + itemArr.get(orderPos - 1).price;

                        System.out.println(orderArr.get(orderCount - 1).toString());
                        System.out.println(orderHolder[orderCount - 1]);

                        System.out.println("=================================");
                        System.out.println("Press 1 To Add Another Item To Your Order");
                        System.out.println("Press 2 To Complete Your Order");
                        System.out.println("=================================");

                        orderMenu = sc.nextByte();
                    } while (orderMenu != 2);

                    System.out.println("=================================");
                    System.out.println("----------Order Details----------");
                    System.out.println("=================================");

                    orderHolder[orderCount - 1] = "Product Name: " + (String) productName + " | Quantity: " + quantity
                            + " | Price Each: " + itemArr.get(orderPos - 1).price;

                    System.out.println(orderArr.get(orderCount - 1).toString());
                    System.out.println(orderHolder[orderCount - 1]);

                    for (Item item : itemArr) {
                        inv.addInventory(item);
                    }

                    for (Order order : orderArr) {
                        inv.addOrder(order);
                    }
                }
            }
            if (menu == 3) {
                System.out.println("=================================");
                System.out.println("------------Inventory------------");
                System.out.println("=================================");

                System.out.println("===========Item Inventory===========\n");

                inv.getInventory();

            }
            if (menu == 4) {
                inv.getOrders();
            }
            if (menu == 5) {
                System.out.println("=================================");
                System.out.println("-----------All Details-----------");
                System.out.println("=================================");

                System.out.println("===========Item Inventory===========\n");
                inv.getInventory();
                inv.getOrders();

            }
            if (menu == 0) {
                System.out.println("=================================");
                System.out.println("-------------Exiting-------------");
                System.out.println("=================================");
                System.out.println("------------Goodbye!-------------");
                System.out.println("=================================");
                System.out.println("---------Comeback Again!!--------");
                System.out.println("=================================");
                menuTrig = false;
            }

        } while (menuTrig == true);
    }
}

class Inventory {
    ArrayList<Item> itemList;
    ArrayList<Order> orderList;

    public Inventory() {
        itemList = new ArrayList<Item>();
        orderList = new ArrayList<Order>();
    }

    public void addInventory(Item item) {
        itemList.add(item);
    }

    public void getInventory() {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void getOrders() {
        for (Order order : orderList) {
            System.out.println(order.toString());
        }
    }

    public void ToString() {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }

        for (Order order : orderList) {
            System.out.println(order.toString());
        }
    }

}

class Order {
    String customerName;
    double totalOrder;
    ArrayList<Item> itemsOrdered = new ArrayList<Item>();

    public Order(String customerName, double totalOrder) {
        this.customerName = customerName;
        this.totalOrder = totalOrder;
    }

    public void addItem(Item item) {
        itemsOrdered.add(item);
    }

    public void removeItem(Item item) {
        itemsOrdered.remove(item);
    }

    public String toString() {
        return "Customer Name: " + customerName + " | Total Amount: " + totalOrder
                + "\n==========Items Ordered===========" + "\n " + itemsOrdered.toString();
    }
}

class Item {
    String name;
    String type;
    double price;
    int quantity;

    public Item() {
    }

    public Item(String type, String name, double price, int quantity) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Type: " + type + " | Name: " + name + " | Price: " + price + " | Quantity Remaining: " + quantity;
    }

}

class Clothes extends Item {
    static String type = "Clothes";

    public Clothes(String name, double price, int quantity) {
        super(type, name, price, quantity);
    }
}

class Cosmetics extends Item {
    static String type = "Cosmetics";

    public Cosmetics(String name, double price, int quantity) {
        super(type, name, price, quantity);

    }
}

class Electronics extends Item {
    static String type = "Electronics";

    public Electronics(String name, double price, int quantity) {
        super(type, name, price, quantity);
    }
}
