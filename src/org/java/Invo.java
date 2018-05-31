package org.java;

public class Invo {
	public static void main(String args[]) {
		Invoice invoice1 = new Invoice();
		invoice1.setPartDescription("bolt");
		invoice1.setPartNumber("5");
		invoice1.setQuantity(100);
		Invoice invoice2 = new Invoice();
		invoice2.setPartDescription("nut");
		invoice2.setPartNumber("5");
		invoice2.setPrice(150);
		invoice2.setQuantity(3);
		invoice1.getInvoiceAmount();
		System.out.println(invoice1.getInvoiceAmount());
		System.out.println(invoice2.getInvoiceAmount());
}
}