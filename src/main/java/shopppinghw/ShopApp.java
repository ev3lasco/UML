package shopppinghw;

public class ShopApp {
    public static void printPersonName(Person person) {
        if (person instanceof Manager) {
            System.out.println(person.getName());
        } else if (person instanceof Student) {
            System.out.println("hi");
        }
    }

    public static double calculateTotal (Product [] products){
        //create a variable to stare the value for the total
        double total = 0.0;
        for (Product p:products
             ) {

        }
        return 0.0;
    }

    public static boolean isAFit(Customer customer, Product product){
        return false;
    }
            //for every item in the array that is discountable
                public static void printEveryDiscountAvailableForAProduct(Discountable[] discountables, Product products){
                    for (Discountable disc: discountables ){
                        System.out.println(String.format("%.2f",disc.calculateDiscount(products)));
                }
                // calculate the discount for each product's price
            }
        }

