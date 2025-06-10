package view;

import controller.ControllerBubbleSort;
import controller.ControllerMergeSort;
import controller.ControllerQuickSort;

public class ComparadorOrdenacao {

	public static void main(String[] args) {
		int[] arrayOrdenado = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] arrayInverOrdenado = {8, 7, 6, 5, 4, 3, 2, 1};
		int[] arrayAleatorio = {7, 23, 17, 0, 8, 2, 1, 2};
		int[] arrayGrandeAleatorio = {2, 4, 0, 43, 2, 14, 87, 3, 23, 89, 32, 1, 8, 4, 2, 0, 87, 3};
		
		//BubbleSort
		ControllerBubbleSort BubbleSort = new ControllerBubbleSort();
		System.out.println("Tempo de execução do BubbleSort para array ordenado, desordenado, aleatório e grande:");
		
		double tempoInicial = System.nanoTime();
		BubbleSort.BubbleSort(arrayOrdenado);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		tempoInicial = System.nanoTime();
		BubbleSort.BubbleSort(arrayInverOrdenado);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		tempoInicial = System.nanoTime();
		BubbleSort.BubbleSort(arrayAleatorio);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		tempoInicial = System.nanoTime();
		BubbleSort.BubbleSort(arrayGrandeAleatorio);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		//MergeSort
		System.out.println("Tempo de execução do MergeSort para array ordenado, desordenado, aleatório e grande:");
		ControllerMergeSort mergeSort = new ControllerMergeSort();
		tempoInicial = System.nanoTime();
		mergeSort.mergeSort(arrayOrdenado);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		tempoInicial = System.nanoTime();
		mergeSort.mergeSort(arrayInverOrdenado);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		tempoInicial = System.nanoTime();
		mergeSort.mergeSort(arrayAleatorio);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		tempoInicial = System.nanoTime();
		mergeSort.mergeSort(arrayGrandeAleatorio);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		//QuickSort
		System.out.println("Tempo de execução do QuickSort para array ordenado, desordenado, aleatório e grande:");
		ControllerQuickSort quickSort = new ControllerQuickSort();
		tempoInicial = System.nanoTime();
		quickSort.ordenar(arrayOrdenado);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		tempoInicial = System.nanoTime();
		quickSort.ordenar(arrayOrdenado);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		tempoInicial = System.nanoTime();
		quickSort.ordenar(arrayOrdenado);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
		
		tempoInicial = System.nanoTime();
		quickSort.ordenar(arrayOrdenado);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(tempoTotal+"s.");
	}

}
