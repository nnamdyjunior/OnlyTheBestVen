package team6Final;

public interface ITaxAdapter {
	Double taxRate = 10.0;
	
	//calculate the tax, given the country's tax rate
	public Double calculateTax(Double amount);
}
