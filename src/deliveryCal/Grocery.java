package deliveryCal;

public class Grocery extends Product implements DeliveryChargeCalculator{
    public Grocery(String name, int weight, int price){
        super(name, weight, price);
    }

    @Override
    public int getDeliveryCharge(int price, int weight) {
        return super.deliveryChargePrice(price, weight);
    }
}

