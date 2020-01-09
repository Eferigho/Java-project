package Chapter5;

public class Invoice {
private String partNumber;
private String partDescription;
private int quantityPurchase;
private double pricePerItem;
private double invoiceAmount;

	public Invoice(String partNumber, String partDescription, int quantityPurchase, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantityPurchase = quantityPurchase;
		this.pricePerItem = pricePerItem;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setQuantityPurchase(int quantityPurchase) {
		this.quantityPurchase = quantityPurchase;
	}
	public int getQuantityPurchase() {
		return quantityPurchase;
	}
	
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setInvoiceAmount(int quantityPurchase, double pricePerItem) {
		if(quantityPurchase < 0) {
			quantityPurchase = 0;
		}
		if(pricePerItem < 0) {
			pricePerItem = 0.0;
		}
		this.invoiceAmount = this.quantityPurchase * this.pricePerItem;
	}
	public double getInvoiceAmount() {
		return invoiceAmount;
	}
}
