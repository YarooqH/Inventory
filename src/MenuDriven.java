// public class MenuDriven {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// ArrayList<Item> itemArr = new ArrayList<Item>();
// ArrayList<Order> orderArr = new ArrayList<Order>();

// boolean menuTrig = true;
// boolean opMenuTrig = true;

// int arrIndex = 0;

// do {
// System.out.println("=======Inventory System=======");
// System.out.println("Press 1 To Add Items To Inventory");
// System.out.println("Press 2 To Add Order");
// System.out.println("Press 3 To Show Inventory");
// System.out.println("Press 4 To Show Orders");
// System.out.println("Press 5 To Show All Details");
// System.out.println("Press 0 To Exit");

// byte menu = sc.nextByte();

// if (menu == 0) {
// menuTrig = false;
// }
// if (menu == 1) {
// byte subMenu;

// System.out.println("Select from The Following Options");
// System.out.println("=================================");
// System.out.println("Press 1 To Add Clothes");
// System.out.println("Press 2 To Add Cosmetics");
// System.out.println("Press 3 To Add Electronis");

// subMenu = sc.nextByte();

// if (subMenu == 1) {
// String name;
// double price;
// int quantity;

// System.out.print("Enter Name: ");
// name = sc.next();

// System.out.print("Enter Price: ");
// price = sc.nextDouble();

// System.out.print("Enter Quantity: ");
// quantity = sc.nextInt();

// itemArr.add(Clothes(name, price, quantity));

// }

// }
// if (menu == 2) {
// double salary;

// System.out.print("Enter Name: ");
// Name = sc.next();

// System.out.print("Enter ID: ");
// ID = sc.next();

// System.out.print("Enter Salary: ");
// salary = sc.nextDouble();

// empArr[arrIndex] = new SalaryEmployee(Name, ID, salary);
// arrIndex++;

// }
// if (menu == 3) {
// int sales;
// double commissionRate;

// System.out.print("Enter Name: ");
// Name = sc.next();

// System.out.print("Enter ID: ");
// ID = sc.next();

// System.out.print("Enter Number of Sales Completed: ");
// sales = sc.nextInt();

// System.out.print("Enter Commission Rate: ");
// commissionRate = sc.nextDouble();

// empArr[arrIndex] = new CommissionEmployee(Name, ID, sales, commissionRate);
// arrIndex++;
// }
// if (menu == 4) {
// double perHourRate;
// int hoursWorked;
// int sales;
// double commissionRate;
// double salary;

// System.out.print("Enter Name: ");
// Name = sc.next();

// System.out.print("Enter ID: ");
// ID = sc.next();

// System.out.print("Enter Per Hour Rate: ");
// perHourRate = sc.nextDouble();

// System.out.print("Enter Number Of Hours Worked: ");
// hoursWorked = sc.nextInt();

// System.out.print("Enter Number of Sales Completed: ");
// sales = sc.nextInt();

// System.out.print("Enter Commission Rate: ");
// commissionRate = sc.nextDouble();

// System.out.print("Enter Salary: ");
// salary = sc.nextDouble();

// empArr[arrIndex] = new SalaryCommisionEmployee(Name, ID, sales,
// commissionRate, salary);
// arrIndex++;
// }
// if (menu == 5) {
// for (Employee i : empArr) {
// if (i instanceof SalaryCommisionEmployee) {
// double newSalary;
// newSalary = i.getSalary() * 0.1;

// i.setSalary(newSalary);
// }
// }
// System.out.println("==============================================");
// System.out.println("Given 10% Raise To Salary Commission Employees");
// System.out.println("==============================================");
// do {
// byte opMenu;
// System.out.println("================Sub Menu================");
// System.out.println("Press 1 To Print The Earnings Of All Employees");
// System.out.println("Press 2 To Print The Names Of All Employees");
// System.out.println("Press 3 To Print The IDs Of All Employees");
// System.out.println("Press 4 To Print All The Details Of All Employees
// #GODMODE");
// System.out.println("Press 0 To Exit");

// opMenu = sc.nextByte();

// if (opMenu == 1) {
// System.out.println("===================================");
// for (Employee employee : empArr) {
// if (employee != null) {
// System.out.println(employee.earnings());
// } else {
// break;
// }
// }

// }
// if (opMenu == 2) {
// System.out.println("===================================");
// for (Employee employee : empArr) {
// if (employee != null) {
// System.out.println(employee.getName());
// } else {
// break;
// }
// }
// }
// if (opMenu == 3) {
// System.out.println("===================================");
// for (Employee employee : empArr) {
// if (employee != null) {
// System.out.println(employee.getID());
// } else {
// break;
// }
// }
// }
// if (opMenu == 4) {
// System.out.println("===================================");
// for (Employee employee : empArr) {
// if (employee != null) {
// System.out.println(employee.toString());
// } else {
// break;
// }
// }
// }
// if (opMenu == 0) {
// opMenuTrig = false;
// }
// } while (opMenuTrig == true);
// }
// if (menu == 0) {
// menuTrig = false;
// }
// } while (menuTrig == true);
// }

// }
