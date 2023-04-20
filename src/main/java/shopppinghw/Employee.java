package shopppinghw;


public abstract class Employee extends Customer{
    protected final double EMPLOYEE_DISCOUNT = .10;
    public Employee(String name, Product[] products, Size size) {
        super(name, products, size);
    }

    // ABSTRACT METHODS JUST HAVE A SIGNATURE, NO BODY{} / IMPLEMENTATION.

    public abstract void printEmployeePriceAfterDiscount(Product product);

    public double calculateDiscount(Product product) {
        double result = product.getPrice() * EMPLOYEE_DISCOUNT;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EMPLOYEE_DISCOUNT=" + EMPLOYEE_DISCOUNT +
                '}';
    }
}
