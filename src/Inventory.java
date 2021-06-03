// import java.util.ArrayList;
// import java.util.Scanner;

// public class Inventory {
// ArrayList<Item> itemList;
// ArrayList<Order> orderList;

// public Inventory() {
// itemList = new ArrayList<Item>();
// orderList = new ArrayList<Order>();
// }

// public void addInventory(Item item) {
// itemList.add(item);
// }

// public void getInventory() {
// for (Item item : itemList) {
// item.toString();
// }
// }

// public void addOrder(Order order) {
// orderList.add(order);
// }

// public void getOrders() {
// for (Order order : orderList) {
// order.toString();
// }
// }

// public void ToString() {
// for (Item item : itemList) {
// item.toString();
// }

// for (Order order : orderList) {
// order.toString();
// }
// }

// }

// class Order {
// String customerName;
// double totalOrder;
// ArrayList<Item> itemsOrdered;

// public Order(String customerName, double totalOrder) {
// this.customerName = customerName;
// this.totalOrder = totalOrder;
// itemsOrdered = new ArrayList<Item>();
// }

// public void addItem(Item item) {
// itemsOrdered.add(item);
// }

// public void removeItem(Item item) {
// itemsOrdered.remove(item);
// }

// public String toString() {
// return "Customer Name: " + customerName + "|Total Orders: " + totalOrder;
// }
// }

// class Item {
// String name;
// double price;
// int quantity;

// public Item() {
// }

// public Item(String name, double price, int quantity) {
// this.name = name;
// this.price = price;
// this.quantity = quantity;
// }

// public void setQuantity(int quantity) {
// this.quantity = quantity;
// }

// public int getQuantity() {
// return quantity;
// }

// public void setPrice(int price) {
// this.price = price;
// }

// public double getPrice() {
// return price;
// }

// public String toString() {
// return "Name: " + name + "|Price: " + price + "|Quantity: " + quantity;
// }

// }

// class Clothes extends Item {
// public Clothes(String name, double price, int quantity) {
// super(name, price, quantity);
// }
// }

// class Cosmetics extends Item {
// public Cosmetics(String name, double price, int quantity) {
// super(name, price, quantity);
// }
// }

// class Electronics extends Item {
// public Electronics(String name, double price, int quantity) {
// super(name, price, quantity);
// }
// }
