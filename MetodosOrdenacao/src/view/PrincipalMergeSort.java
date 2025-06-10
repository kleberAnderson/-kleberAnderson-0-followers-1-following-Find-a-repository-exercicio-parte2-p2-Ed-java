package view;

import controller.ControllerMergeSort;

public class PrincipalMergeSort {

	public static void main(String[] args) {
		int[] vetor = {12, 9, 8, 4, 10, 5, 11, 3, 1, 2, 6, 7};
		ControllerMergeSort ord = new ControllerMergeSort();
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i++) {
			System.out.print(" ["+vetor[i]+"] ");
		}
		ord.mergeSort(vetor);
		System.out.println();
		for(int i = 0; i < tamanho; i++) {
			System.out.print(" ["+vetor[i]+"] ");
		}
	}

}
