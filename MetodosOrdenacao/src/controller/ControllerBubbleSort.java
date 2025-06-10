package controller;

public class ControllerBubbleSort {

	public ControllerBubbleSort() {
		super();
	}
	
	public void BubbleSort(int[] vetor) {
		boolean ordenacao = false;
		
		int tamanho = vetor.length;
		
		for(int i = 0; i < tamanho - 1; i++) {
			if(vetor[i] < vetor[i + 1]) {
				ordenacao = true;
			} else {
				ordenacao = false;
				break;
			}
		}
		
		if(!ordenacao) {
			boolean troca = true;
			int aux;
			while(troca) {
				troca = false;
				for(int i = 0; i <vetor.length - 1; i++) {
					if(vetor[i] > vetor[i + 1]) {
						aux = vetor[i];
						vetor[i] = vetor[i + 1];
						vetor[i + 1] = aux;
						troca = true;
					}
				}
			}
			System.out.println("\nVetor ordenado!");
		} else {
			System.out.println("\nVetor já esteve ordenado!");
		}
	}	
}
