package Lab_4;

public class Holodec implements Priceable {
    int price;

    Holodec(int price){
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
