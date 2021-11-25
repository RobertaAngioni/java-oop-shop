package it.shop;

import java.util.Random;
import java.util.Scanner;

public class Prodotto {
	
	// attributi
	
	private int code;
	private String name;
	private String description;
	private int price;
	private int iva;
	
	// cpstruttori
	
	public Prodotto() {
		this.code = codeGenerator();
		this.price = basePrice();
		this.iva = ivaPriceCalculator();
		this.name = extendedName();
		
	}
	
	
	
	
	// metodi
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public int getIva() {
		return iva;
	}




	public void setIva(int iva) {
		this.iva = iva;
	}




	public int getCode() {
		return code;
	}




	private int codeGenerator() {
		Random rand = new Random();
		return rand.nextInt();
	}
	
	public int basePrice() {
		Random rand = new Random();
		return rand.nextInt(101);
	}
	
	public int ivaPriceCalculator() {
		return price + (price * 22 / 100);
	}
	
	private String extendedName() {
		
	
		return name + code;
	}
	
	
}
