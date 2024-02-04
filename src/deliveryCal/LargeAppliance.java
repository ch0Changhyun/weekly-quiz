package deliveryCal;

public class LargeAppliance extends Product implements DeliveryChargeCalculator {
    public LargeAppliance(String name, int weight, int price) {
        super(name, weight, price);
    }

    @Override
    public int getDeliveryCharge(int price, int weight) {
        return super.deliveryChargePrice(price, weight);
    }
}
