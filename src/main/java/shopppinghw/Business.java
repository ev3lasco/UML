package shopppinghw;

public class Business implements Discountable {
    private String address;
    private Product product;
    private final double BUSINESS_DISCOUNT = .25;

    public Business(String address, Product product) {
        this.address = address;
        this.product = product;
    }

    @Override
    public double calculateDiscount(Product product) {
        return (BUSINESS_DISCOUNT* product.getPrice());
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDISCOUNT() {
        return BUSINESS_DISCOUNT;
    }

    @Override
    public String toString() {
        return "Business{" +
                "address='" + address + '\'' +
                ", product=" + product +
                ", DISCOUNT=" + BUSINESS_DISCOUNT +
                '}';
    }
}
