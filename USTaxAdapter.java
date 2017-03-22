package team6Final;

//the tax calculator to be used in The United States
public class USTaxAdapter implements ITaxAdapter{

	private Double taxRate = 40.00;
	
	public Double calculateTax(Double amount){
		Double tax = (taxRate/100) * amount;
		
		return tax;
	}
}
