package controller;

public class ControllerQuickSort {

	public ControllerQuickSort() {
		super();
	}
	
	public void ordenar(int[] vetor) {
		quick(vetor, 0, vetor.length - 1);
	}
	public void ordenarDecrescente(int[] vetor) {
		quick2(vetor, 0, vetor.length - 1);
	}

	private void quick(int[] vetor, int inicio, int fim) {
		if(inicio < fim) {
			int pos = dividir(vetor, inicio, fim);
			quick(vetor, inicio, pos - 1);
			quick(vetor, pos + 1, fim);
		}
	}
	private void quick2(int[] vetor, int inicio, int fim) {
		if(inicio < fim) {
			int pos = dividir2(vetor, inicio, fim);
			quick2(vetor, inicio, pos - 1);
			quick2(vetor, pos + 1, fim);
		}
	}

	private int dividir(int[] vetor, int inicio, int fim) {
		int meio = (inicio + fim) / 2;
	
		trocar(vetor, inicio, meio);
		 
		int pivo = vetor[inicio];
		int pontDir = fim;
		int pontEsq = inicio + 1;
		
		while(pontEsq <= pontDir) {
			while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
				pontEsq++;
			}
			while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
				pontDir--;
			}
			if(pontEsq < pontDir) {
				trocar(vetor, pontDir, pontEsq);
			}
		}
		trocar(vetor, inicio, pontDir);
		return pontDir;
	}
	
	private int dividir2(int[] vetor, int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		trocar(vetor, inicio, meio);
		
		int pivo = vetor[inicio];
		int pontDir = fim;
		int pontEsq = inicio + 1;
		
		while(pontEsq <= pontDir) {
			while(pontEsq <= pontDir && vetor[pontEsq] >= pivo) {
				pontEsq++;
			}
			while(pontDir >= pontEsq && vetor[pontDir] < pivo) {
				pontDir--;
			}
			if(pontEsq < pontDir) {
				trocar(vetor, pontEsq, pontDir);
				pontEsq++;
				pontDir--;
			}
		}
		trocar(vetor, inicio, pontDir);
		
		return pontDir;
	}

	private void trocar(int[] vetor, int i, int j) {
		int temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}
}
