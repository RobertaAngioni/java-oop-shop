package it.shop;



public class Main {

	public static void main(String[] args) {
		


		
		Prodotto prod1 = new Prodotto();
		

		
		
		System.out.println("Il nome esteso del codice numero " + prod1.getCode() + " � " + prod1.getName());
		System.out.println("Il prezzo di questo prodotto �: " + prod1.getPrice() + ", con IVA � :" + prod1.getIva());
	}

}
