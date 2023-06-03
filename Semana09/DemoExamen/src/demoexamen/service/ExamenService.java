package demoexamen.service;

import demoexamen.model.Punto;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class ExamenService {
	
	private static int n;
	private static List<Punto> puntos;
	
	static {
		n = 0;
		puntos = new ArrayList<>();
	}
	
	public void setValorN(int valor){
		n = valor;
	}
	
	public void generarPuntos(){
		int x, y;
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			x = (rnd.nextInt(50) + 1)*(int)Math.pow(-1, rnd.nextInt(2) + 1);
			y = (rnd.nextInt(50) + 1)*(int)Math.pow(-1, rnd.nextInt(2) + 1);
			puntos.add(new Punto(x,y));
		}
	}
	
	public void procesarPuntos(){
		for (Punto punto : puntos) {
			punto.setCuadrante(obtenerCuadrante(punto));
			punto.setDistancia(obtenerDistancia(punto));
		}
	}

	private int obtenerCuadrante(Punto p) {
		int cuadrante = 0;
		cuadrante = (p.getX()>0 && p.getY()>0)?1:cuadrante;
		cuadrante = (p.getX()<0 && p.getY()>0)?2:cuadrante;
		cuadrante = (p.getX()<0 && p.getY()<0)?3:cuadrante;
		cuadrante = (p.getX()>0 && p.getY()<0)?4:cuadrante;
		return cuadrante;
	}

	private double obtenerDistancia(Punto p) {
		double distancia;
		distancia = Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2);
		distancia = Math.sqrt(distancia);
		return redondeo(distancia);
	}
	
	public List<Punto> obtenerPuntos(){
		return puntos;
	}
	
	public double obtenerDistanciaPromedio(){
		double suma = 0;
		for (Punto punto : puntos) {
			suma += punto.getDistancia();
		}
		return redondeo( suma/n);
	}
	
	private double redondeo(double valor){
		valor = valor * 100;
		valor = Math.round(valor) / 100.0;
		return valor;
	}
}
