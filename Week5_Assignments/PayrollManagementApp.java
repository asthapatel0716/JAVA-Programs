interface Payable {
    double calculatePayment();
}
abstract class Employee implements Payable {
    private String name;
    private int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public abstract String getEmployeeType();
}
class SalariedEmployee extends Employee {
    private double monthlySalary;
    SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        if (monthlySalary <= 0) {
            System.out.println("Salary must be greater than zero.");
        }
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculatePayment() {
        return monthlySalary;
    }
    @Override
    public String getEmployeeType() {
        return "Salaried Employee";
    }
}
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        if (hourlyRate <= 0 || hoursWorked < 0) {
            System.out.println("Hours must be greater than zero.");
        }
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }
    @Override
    public String getEmployeeType() {
        return "Hourly Employee";
    }
}
class Invoice implements Payable {
    private String invoiceNumber;
    private double amount;
    Invoice(String invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        if (amount <= 0) {
           System.out.println("Amount must be greater than zero.");
        }
        this.amount = amount;
    }
    @Override
    public double calculatePayment() {
        return amount;
    }
}
public class PayrollManagementApp {
  public static void main(String[] args) {
    Payable p1 = new SalariedEmployee("Astha", 101, 50000);
    Payable p2 = new SalariedEmployee("Riya", 102, 45000); 
    Payable p3 = new HourlyEmployee("Ananya", 103, 500, 80); 
    Payable p4 = new HourlyEmployee("Neha", 104, 400, 100); 
    Payable p5 = new Invoice("INV101", 25000); 
    Payable[] payments = {p1, p2, p3, p4, p5}; 
    for (Payable p : payments) { 
      System.out.println(p);
      System.out.println("Payment: " + p.calculatePayment()); 
    }
  }
