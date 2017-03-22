package team6Final;

class CreditCard{
	//account details
    private static String username = "Tom Cruise";
    private static Double accountBalance = 2000000.00;

    //change the account balance when a purchase is made
    public static void setNewBalance (Double amt){ //doing
   
    	accountBalance -= amt;
        
    }
    
    //get the account balance
    public static Double getBalance() { return accountBalance; } //knowing
}