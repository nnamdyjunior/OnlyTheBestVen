package team6Final;

import java.util.Date;

class Sale{

    private String time;
    Double tax;
    private ProductDescription product;
    private String status;

    public void makeSaleItem(ProductDescription desc) { this.product = desc; } //doing

    //get the total price of the item (base price plus whatever tax)
    public Double getPrice() throws InstantiationException, IllegalAccessException, ClassNotFoundException{ 
        //calculate the tax
       	String currentCountry = System.getProperty("user.country");
       	ITaxAdapter taxAd = (ITaxAdapter)Class.forName("team6Final."+ currentCountry + "TaxAdapter").newInstance();
    	Double productTax = taxAd.calculateTax(product.getPrice());
    	tax = productTax;
    	
    	//return price plus tax
       	return product.getPrice() + productTax; 
    	
    } //doing and knowing

    //check that the customer has sufficient funds and deduct the amount from the account
    public void makePayment() throws InstantiationException, IllegalAccessException, ClassNotFoundException{ //doing
        if (CreditCard.getBalance() >= this.getPrice()){
            CreditCard.setNewBalance(this.getPrice());
            time = new Date().toGMTString();
            status = "accepted";
        }
        else{
        	status = "denied";
        }
    }
    
    //provide feedback (positive if sale was successful, else, negative)
    public String makeReceipt(){ //doing
    	if (status == "denied"){
    		return "Sorry, insufficient balance!";
    	}
    	else {
    		return "Thank you! Please take your item: " + product.getDescription() +
            		" ($"+product.getPrice() +")"
            		+"\nLocation: " + System.getProperty("user.country") + "; Tax: $" + tax
            				+ "\nAccount Balance: $"+CreditCard.getBalance()+
            				"\nTime of Sale: "+time; 
    	}
    }
    
    
}