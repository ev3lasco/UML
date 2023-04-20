package shopppinghw;

public class Main {
    public static void main(String[] args) {
        // create a product shirt
        Product product1 = new Product("Shirt",10.0,Size.LARGE);
        Product product2 = new Product("Pants",450.0,Size.MEDIUM);
        Product product3 = new Product("Shoes",18040.0,Size.SMALL);

        //create an aray of produts to use with manager class

        Product [] products = {product1,product2,product3};
        Manager manager = new Manager("Wildin",products,Size.LARGE);
        Student student = new Student("Homie", products, Size.SMALL);
        Business business = new Business("452 East Palm Beach FL 19458",product1);
        Discountable [] discountables = {manager,student,business};
        ShopApp.printEveryDiscountAvailableForAProduct(discountables,product1);



        System.out.println(student);
       System.out.println(business);
       ShopApp.printPersonName(manager);
       ShopApp.printPersonName(student);


    }
}
