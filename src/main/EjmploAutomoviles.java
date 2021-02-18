/**
 * 
 */
package main;

import common.Sort;

/**
 * @author moise
 *
 */
public class EjmploAutomoviles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil[] arregloAutos = new Automovil[5];
		arregloAutos[0] = new Automovil("Toyota", "Yaris", 2017, 200);
		arregloAutos[1] = new Automovil("Honda", "Civic", 2007, 10);
		arregloAutos[2] = new Automovil("Toyota", "Corolla", 2015, 5);
		arregloAutos[3] = new Automovil("Honda", "CRV", 2016, 2);
		arregloAutos[4] = new Automovil("Nissan", "Sentra", 1992, 8);
		
		Sort mySort = new Sort(new CompareByYearDesc());
		
		System.out.println(" ** Arreglo original **");
		for (int i = 0; i < arregloAutos.length; i++) {
			System.out.println("Auto: " + arregloAutos[i].getMarca() + " " + arregloAutos[i].getLinea() + " " + arregloAutos[i].getAnio_Fabricacion());
		}
		
		mySort.BubbleSort(arregloAutos);
		
		System.out.println(" ** Arreglo ordenado descendente por año **");
		for (int i = 0; i < arregloAutos.length; i++) {
			System.out.println("Auto: " + arregloAutos[i].getMarca() + " " + arregloAutos[i].getLinea() + " " + arregloAutos[i].getAnio_Fabricacion());
		}
		
		mySort.myCompare = new CompareByYearAsc();
		mySort.insertionSort(arregloAutos);
		
		System.out.println(" ** Arreglo ordenado ascendente por año**");
		for (int i = 0; i < arregloAutos.length; i++) {
			System.out.println("Auto: " + arregloAutos[i].getMarca() + " " + arregloAutos[i].getLinea() + " " + arregloAutos[i].getAnio_Fabricacion());
		}
		
		mySort.myCompare = new CompareByBrandLineAsc();
		mySort.quickSort(arregloAutos, 0, arregloAutos.length - 1);
		
		System.out.println(" ** Arreglo ordenado ascendente por marca**");
		for (int i = 0; i < arregloAutos.length; i++) {
			System.out.println("Auto: " + arregloAutos[i].getMarca() + " " + arregloAutos[i].getLinea() + " " + arregloAutos[i].getAnio_Fabricacion());
		}
	}
	
	

}
