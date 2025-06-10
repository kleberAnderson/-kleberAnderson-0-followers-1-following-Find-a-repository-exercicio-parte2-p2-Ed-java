package view;

import controller.ControllerBubbleSort;

public class PrincipalBubbleSort {

	public static void main(String[] args) {
		int[] vetorDesordenado = {4, 0, 54, 1, 3};
		int[] vetorOrdenado = {0, 1, 2, 5, 6};
		
		System.out.println("Vetor desordenado antes:");
		for(int i = 0; i < vetorDesordenado.length; i++) {
			System.out.print(" ["+vetorDesordenado[i]+"] ");
		}
		
		System.out.println("\nVetor ordenado antes:");
		for(int i = 0; i < vetorDesordenado.length; i++) {
			System.out.print(" ["+vetorOrdenado[i]+"] ");
		}
	
		
		ControllerBubbleSort ord = new ControllerBubbleSort();
		
		ord.BubbleSort(vetorDesordenado);
		for(int i = 0; i < vetorDesordenado.length; i++) {
			System.out.print(" ["+vetorDesordenado[i]+"] ");
		}
		
		ord.BubbleSort(vetorOrdenado);
		for(int i = 0; i < vetorDesordenado.length; i++) {
			System.out.print(" ["+vetorOrdenado[i]+"] ");
		}
	}

}
