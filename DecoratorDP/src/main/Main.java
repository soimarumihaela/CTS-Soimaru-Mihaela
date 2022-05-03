package main;

import decorator.Decorator;
import decorator.DecoratorAbstract;
import decorator.Imprimanta;
import decorator.InterfataImprimanta;

public class Main {

	public static void main(String[] args) {
		   InterfataImprimanta interfataImprimanta= new Imprimanta(5);
	        interfataImprimanta.printeazaBilet();

	        DecoratorAbstract decoratorAbstract = new Decorator(interfataImprimanta, "Paste fericit!");

	        decoratorAbstract.printeazaBilet();
	        decoratorAbstract.printeazaVerso();
	    }

	}


