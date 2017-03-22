package team6Final;

import java.util.*;

class ProductCatalog{

    private Map<Integer, ProductDescription> storeItems = new HashMap<Integer, ProductDescription>();
    ProductDescription desc;

    ProductCatalog(){
    	//add items to the product catalog
        desc = new ProductDescription(1, 25000.00, "Rolex Wristwatch"); 
        storeItems.put(desc.getItemID(), desc);
        desc = new ProductDescription(2, 58000.00, "Hublot Wristwatch"); 
        storeItems.put(desc.getItemID(), desc);
        desc = new ProductDescription(3, 36000.00, "Gold Ring"); 
        storeItems.put(desc.getItemID(), desc);
        desc = new ProductDescription(4, 783600.00, "Diamond Encrusted Cartier Wristwatch"); 
        storeItems.put(desc.getItemID(), desc);
        desc = new ProductDescription(5, 980000.00, "Diamond Engagement Ring"); 
        storeItems.put(desc.getItemID(), desc);
        desc = new ProductDescription(6, 28000.00, "RayBan, Limited Edition"); 
        storeItems.put(desc.getItemID(), desc);
        desc = new ProductDescription(7, 100000.00, "Gold Bar"); 
        storeItems.put(desc.getItemID(), desc);
        desc = new ProductDescription(8, 698000.00, "Diamond Necklace"); 
        storeItems.put(desc.getItemID(), desc);
        desc = new ProductDescription(9, 215000.00, "Gold Earrings (1 pair)"); 
        storeItems.put(desc.getItemID(), desc);
    }

    //get description of a product
    public ProductDescription getProductDescription(int ID) { return storeItems.get(ID); }//knowing 
}