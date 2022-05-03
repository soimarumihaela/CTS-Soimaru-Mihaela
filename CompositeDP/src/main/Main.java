package main;

import composite.Autobuz;
import composite.Flota;
import composite.Item;

public class Main {

	public static void main(String[] args) {
		
		Flota flota=new Flota("companie");
        Autobuz autobuz=new Autobuz("Mercedes","MX123",10);
        Autobuz autobuz2=new Autobuz("Otokar","MX123",10);
        Autobuz autobuz3=new Autobuz("Otokar","MX123",20);
        Autobuz autobuz4=new Autobuz("Mercedes","MX123",20);
        Autobuz autobuz5=new Autobuz("Opel","MX123",40);
        Autobuz autobuz6=new Autobuz("Opel","MX123",40);

        Flota mici=new Flota("autobuze mici");
        Flota medii=new Flota("autobuze medii");
        Flota mari=new Flota("autobuze mari");

        mici.adaugaItem(autobuz);
        mici.adaugaItem(autobuz2);
        medii.adaugaItem(autobuz3);
        medii.adaugaItem(autobuz4);
        mari.adaugaItem(autobuz5);
        mari.adaugaItem(autobuz6);

        flota.adaugaItem(mici);
        flota.adaugaItem(medii);
        flota.adaugaItem(mari);

        mici.stergeItem(autobuz2);

        flota.descrieItem();
        System.out.println("Garantie pentru flota mare "+mari.calculeazSumaGarantata(50));

        Item obtinut=mari.getItem(1);
        obtinut.descrieItem();

	}

}
