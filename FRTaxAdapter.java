package team6Final;

//Le calculateur d'impôt à utiliser en France (the tax calculator to be used in France)
public class FRTaxAdapter implements ITaxAdapter{

	private Double taxRate = 35.00;
	
	public Double calculateTax(Double amount){
		Double tax = (taxRate/100) * amount;
		
		return tax;
	}
	
}
