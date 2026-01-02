package behavioral.momento;

public class ShopItem {

    private int price;
    private final ItemState itemState = new ItemState(price);

    public ShopItem(int price) {
        this.price = price;
    }

    public void getPrice() {
        System.out.println("Price is " + price);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //store current price in state
    public void saveState() {
        System.out.println("Saving State:" + price);
        itemState.setOldPrice(price);
    }

    //fetch the last saved price and set it to the current price
    public void undo() {
        price = itemState.getOldPrice();
    }
}
