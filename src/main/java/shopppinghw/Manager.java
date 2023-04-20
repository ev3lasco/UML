package shopppinghw;

public class Manager extends Employee {
    private final double MANAGER_DISCOUNT = .05;

    public Manager(String name, Product[] products, Size size) {
        super(name, products, size);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Product product) {

    }

    @Override
    public double calculateDiscount(Product product) {
        return (MANAGER_DISCOUNT + EMPLOYEE_DISCOUNT) * product.getPrice();
    }
}


