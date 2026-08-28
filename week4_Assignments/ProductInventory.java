class Product {
    private String code, name;
    private double unitPrice;
    private int quantity;
    private static int productCount = 0;
    public Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }
    public Product(String code, String name, double unitPrice, int quantity) {
        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        productCount++;
    }
    public void restock(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Restock amount must be positive");
        }
        quantity += amount;
    }
    public boolean sell(int amount) {
        if (amount <= 0 || amount > quantity) {
            return false;
        }
        quantity -= amount;
        return true;
    }
    public double getInventoryValue() {
        return unitPrice * quantity;
    }
    public static int getProductCount() {
        return productCount;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Product{code=" + code + ", name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", inventoryValue=" + getInventoryValue() + "}";
    }
}
public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop", 50000);
        Product p2 = new Product("P102", "Mouse", 800, 10);
        Product p3 = new Product("P103", "Keyboard", 1500, 5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.restock(3);
        System.out.println(p1);
        System.out.println(p2.sell(4));
        System.out.println(p2);
        System.out.println(p2.sell(10));
        System.out.println(p2);
        System.out.println(Product.getProductCount());
    }
}
