package team6Final;

public class ProductDescription{

    private String description;
    private Double price;
    private int itemID;

    ProductDescription(int ID, Double prc, String desc){
        this.description = desc;
        this.price = prc;
        this.itemID = ID;
    }

    //get details about a particular product (price and description)
    public String getDescription() { return description; } //knowing
    public Double getPrice() { return price; } //knowing
    public int getItemID() { return itemID; }	//knowing
}