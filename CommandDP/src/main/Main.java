package main;

import javax.management.openmbean.OpenDataException;

import command.Autobuz;
import command.Comanda;
import command.ComandaPlecareInCursa;
import command.Operator;

public class Main {

	public static void main(String[] args) {
		Autobuz a=new Autobuz("B23MIMI");
		Autobuz a2=new Autobuz("B87HAHA");
		Operator operator=new Operator();
		Comanda comanda=new ComandaPlecareInCursa(a, 100);
		Comanda comanda2=new ComandaPlecareInCursa(a2, 200);
		Comanda comanda3=new ComandaPlecareInCursa(a, 300);
		Comanda comanda4=new ComandaPlecareInCursa(a2, 250);
		operator.adauga(comanda);
		operator.adauga(comanda2);
		operator.adauga(comanda3);
		operator.adauga(comanda4);
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		

	}

}
