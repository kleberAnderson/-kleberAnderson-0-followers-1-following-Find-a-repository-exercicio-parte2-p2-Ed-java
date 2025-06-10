package controller;

public class ControllerMergeSort {
	public void mergeSort(int[] vetor) {
		int[] aux = new int[vetor.length];
		mergeSort(vetor, 0, vetor.length - 1, aux);
	}
	
	private void mergeSort(int[]vetor,int inicio, int fim, int[] aux){
		int meio = (fim + inicio) / 2;
		if(inicio < fim) {
			//side left:
			mergeSort(vetor, inicio, meio, aux);
			//side right:
			mergeSort(vetor, meio + 1, fim, aux);
			//mix:
			merge(vetor, inicio, meio, fim, aux);
		}
	}

	private void merge(int[] vetor, int inicio, int meio, int fim, int[] aux) {
		int i = inicio;
		int j = meio + 1;
		int k = 0;
		while(i <= meio && j <= fim) {
			if(vetor[i] <= vetor[j]) {
				aux[k] = vetor[i];
				k++;
				i++;
			} else {
				aux[k] = vetor[j];
				k++;
				j++;
			}
		}
		while(i <= meio) {
			aux[k] = vetor[i];
			k++;
			i++;
		}
		while(j <= fim) {
			aux[k] = vetor[j];
			k++;
			j++;
		}
		i = inicio;
		k = 0;
		while(i <= fim) {
			vetor[i] = aux[k];
			i++;
			k++;
		}
		
	}
}
