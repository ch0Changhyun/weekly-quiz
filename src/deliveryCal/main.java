package deliveryCal;

public class main {
    public static void main(String[] args) {
        Product product = new Product("skin",25,50000);

        System.out.println("customer product "+product.name+"'s delivery fee is "+product.deliveryChargePrice(product.price, product.weight)+"!");
    }
}
