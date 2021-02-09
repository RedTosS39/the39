package android.example.the39project;

public class RecyclerViewItems {
    private String itemName;
    private String productsDescription;
    private int imageView;

    public RecyclerViewItems(String itemName, String productsDescription, int imageView) {
        this.itemName = itemName;
        this.productsDescription = productsDescription;
        this.imageView = imageView;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPrice() {
        return productsDescription;
    }

    public int getImageView() {
        return imageView;
    }
}
