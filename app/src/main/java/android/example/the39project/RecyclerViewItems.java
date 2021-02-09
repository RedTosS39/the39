package android.example.the39project;

public class RecyclerViewItems {
    private int itemName;
    private int price;
    private int imageView;

    public RecyclerViewItems(int itemName, int price, int imageView) {
        this.itemName = itemName;
        this.price = price;
        this.imageView = imageView;
    }

    public int getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public int getImageView() {
        return imageView;
    }
}
