package deliveryCal;

public class Beauty extends Product implements DeliveryChargeCalculator{
    public Beauty(String name, int weight, int price){
        super(name, weight, price);
    }

    @Override
    public int getDeliveryCharge(int price, int weight) {
        return super.deliveryChargePrice(price, weight);
    }
}
