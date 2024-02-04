package deliveryCal;

public class Product {
    String name;
    int weight;
    int price;

    Product(String name, int weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    int deliveryChargeWeight(int weight){
        if(weight < 3){
            return 1000;
        } else if(weight < 10){
            return 5000;
        } else {
            return 10000;
        }
    }

    int deliveryChargePrice(int price, int weight){
        if(price < 30000){
            return deliveryChargeWeight(weight);
        } else if(price <100000){
            return deliveryChargeWeight(weight)-1000;
        } else{
            return 0;
        }
    }
}
