package com.almeda.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class LambdaApp {
	
	public void ordenar(){
		List<String> lista = new ArrayList<>();
		lista.add("Mitocode");
		lista.add("Code");
		lista.add("Mito");
		
		//Sin lambda
		/*Collections.sort(lista, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});*/
		
		//Con lambda
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	public void calcular(){
		//Sin lambda
		Operacion operacion = new Operacion(){
			@Override
			public double calcularPromedio(double n1, double n2) {
				return (n1+n2)/2;
			}
			
		};		
		System.out.println(operacion.calcularPromedio(2, 3));
		
		
		/*
		//Con lambda
		Operacion operacion = (double x, double y)-> (x+y)/2;
		System.out.println("Con lambda -> " + operacion.calcularPromedio(2, 3));
		*/
	}
	
    public static void main( String[] args ){
    	
        System.out.println( "Hello World!" );
        LambdaApp app = new LambdaApp();
        app.ordenar();
        app.calcular();
        
        
    }
}
