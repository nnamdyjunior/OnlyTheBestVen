package team6Final;

//the tax calculator to be used in The United Kingdom (England, Scotland, Northern Ireland and Wales)
public class UKTaxAdapter implements ITaxAdapter{

	private Double taxRate = 45.00;
	
	public Double calculateTax(Double amount){
		Double tax = (taxRate/100) * amount;
		
		return tax;
	}
	
}
