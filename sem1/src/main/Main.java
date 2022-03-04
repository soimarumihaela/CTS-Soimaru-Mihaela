package main;


import zoo.Girafa;
import zoo.Ingrijitor;
import zoo.Zebra;
import zoo.Zoo;

public class Main {

	
	public static void main(String[] args) {
        Ingrijitor ingrijitor=new Ingrijitor("Marc Johnson");
        Zoo zooo=new Zoo("Gradina zoologica din Berlin",ingrijitor);

        zooo.addAnimal(new Girafa("Marty"));
        zooo.addAnimal(new Girafa("Luca"));
        zooo.addAnimal(new Zebra("Bob"));

        zooo.hranesteAnimale();
}
}