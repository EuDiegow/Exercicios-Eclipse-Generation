package br.com.generation.repeticao.exercicios;

public class Exercicio01Java {

	public static void main(String[] args) {
		
		for(int i = 1000; i < 2000; i++) {
			
			if(i % 11 == 5) {
				System.out.println("Valores divididos por 11 que o resto � 5:" + i);
			}
		}
	}
		
}
