package Heranca;

import java.util.Scanner;

public abstract class TesteTodosAnimais {
	
	public static void main(String[] args) {
		
		int animal;
		int som = 0;
		
		Scanner ler = new Scanner(System.in);
		
		cachorro romeu = new cachorro();
		preguica preguica = new preguica();
		Cavalo jubileu = new Cavalo();
		
		romeu.setNome("Romeu");
		romeu.setIdade(2);
		
		preguica.setNome("Pregui�inha");
		preguica.setIdade(6);
		
		Cavalo.setNome("Jubileu");
		Cavalo.setIdade(4);
		
		System.out.println(" Escolha um animal : ");
		System.out.println(" 1 - Cachorro ");
		System.out.println(" 2 - Pregui�a ");
		System.out.println(" 3 - Cavalo ");
		animal = ler.nextInt();
		
		{
			if (animal ==1);
		System.out.println(" O Nome do cachorro : Romeu " );
		System.out.println("Romeu tem 2 anos " );
			animal = ler.nextInt();
		
		
		} if (animal == 2) {
				
			System.out.println(" O Nome da Pregui�a � : Pregui�inha ");
			System.out.println("A pregui�a tem : 6 anos ");
			animal = ler.nextInt();
				
		}
		
		{ 	 if (animal == 3);
		System.out.println("O nome do Cavalo � : Jubileu");
		System.out.println("O Jubileu tem : 4 anos ");
		
		}
		
			ler.close();
		
				
		}
}
				

			