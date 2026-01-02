package behavioral.momento;

public class MomentoMain {
    public static void main(String[] args) {
        var shopItem = new ShopItem(24);
        shopItem.getPrice();
        shopItem.setPrice(31);
        shopItem.getPrice();
        //now i want the old price but i dont know what i set it to
        //we create  momento state to store prev values

        shopItem.setPrice(19);
        shopItem.saveState();//this will save 19 in the memory
        shopItem.getPrice();
        //setting new value
        shopItem.setPrice(27);
        shopItem.getPrice();//NOTE I havent saved 27 to the memory!!
        //now i do the undo to get my prev value
        shopItem.undo();
        shopItem.getPrice();//this will get me 19
    }
}
