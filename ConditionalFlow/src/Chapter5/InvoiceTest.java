package Chapter5;
import java.util.Scanner;
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double pricePerItem;
		int quantityPurchase;
		Invoice inv = new Invoice("O","Default",0,0.0);
		System.out.println("Invoice Printing  System");
		inv.setPartNumber("100");
		inv.setPartDescription("Tomatoes");
		inv.setPricePerItem(100);
		inv.setQuantityPurchase(5);
		quantityPurchase = inv.getQuantityPurchase();
		pricePerItem = inv.getPricePerItem();
		
		inv.setInvoiceAmount(quantityPurchase,pricePerItem);
		System.out.printf("The Part Number : %s%n", inv.getPartNumber());
		System.out.printf("The Part Description : %s%n", inv.getPartDescription());
		System.out.printf("The Price Per Item : %.2f Quantity Purchase : %d%n",inv.getPricePerItem(),inv.getQuantityPurchase());
		System.out.printf("The Amount of Items purchase is : %.2f", inv.getInvoiceAmount());

	}

}
