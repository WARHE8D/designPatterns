package behavioral.momento;

public class ItemState {
    private int oldPrice;

    public ItemState(int oldPrice) {
        this.oldPrice = oldPrice;
    }

    public int getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(int oldPrice) {
        this.oldPrice = oldPrice;
    }
}
