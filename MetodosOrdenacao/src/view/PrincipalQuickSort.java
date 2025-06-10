package view;

import controller.ControllerQuickSort;

public class PrincipalQuickSort {

	public static void main(String[] args) {
		int[] vetor = {5, 6, 0, 87, 1};
		ControllerQuickSort cont = new ControllerQuickSort();
		System.out.println("Utilização do pivo do meio do vetor");
	
		cont.ordenar(vetor);	
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(" "+vetor[i]+" ");
		}

		System.out.println("\nOrdem decrescente: ");
		cont.ordenarDecrescente(vetor);	
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(" "+vetor[i]+" ");
		}
	}

}
