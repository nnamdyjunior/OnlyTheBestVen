package team6Final;

class Register{
    private ProductCatalog storeCatalog;
    private Sale currentSale;

    Register(ProductCatalog cat){ this.storeCatalog = cat; }

    public void makeNewSale() { currentSale = new Sale(); } //doing

    //get the item corresponding to the given ID and process it
    public void enterItem(int ID){ //doing
        ProductDescription desc = storeCatalog.getProductDescription(ID);
        currentSale.makeSaleItem(desc);
    }

    //deduct the amount of the item from the customer's account balance and...
    public void makePayment() throws InstantiationException, IllegalAccessException, ClassNotFoundException { 
    	currentSale.makePayment(); 
    	
    } //doing
    
    //... print the receipt
    public String getReceipt(){
    	return currentSale.makeReceipt();
    }
}