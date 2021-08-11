package br.com.generation.Collections;

import java.util.ArrayList;

public class Exercicio03 {

		
	public static void main(String[] args) {
		
		String estoque1 = "Adidas";
		String estoque2 = "Nike";
		String estoque3 = "Puma";
		String estoque4 = "Rebook";
		String estoque5 = "Jordan";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		
		System.out.println(estoque);
		
		estoque.add(estoque5);
		System.out.println(estoque);
		
		estoque.remove(0);
		System.out.println(estoque);

		for(String i: estoque) {
			System.out.println("Temos os tenis: " + i);
		}
		
		
	}
	
	

}
