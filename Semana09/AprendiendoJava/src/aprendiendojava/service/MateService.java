package aprendiendojava.service;

import java.util.Arrays;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class MateService {

	public int promedio(int n1, int n2) {
		return (n1 + n2) / 2;
	}

	public double promedio(double n1, double n2) {
		return (n1 + n2) / 2;
	}

	public double promedio(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;
	}

	/*
	public double promedio(double ... arreglo) {
		double suma = 0;
		for(double valor: arreglo){
			suma+=valor;
		}
		double promedio = suma / arreglo.length;
		return promedio;
	}*/
	
	public double promedio(double ... arreglo) {
		return Arrays.stream(arreglo).average().getAsDouble();
	}
	
}
