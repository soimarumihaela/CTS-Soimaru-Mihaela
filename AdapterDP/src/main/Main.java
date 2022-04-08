package main;

import adapterSubteran.ValidatorMetrou;
import adapterSubteran.ValidatorSubteran;
import adapterTerestru.AdapterObiecte;
import adapterTerestru.ValidatorAdapter;
import adapterTerestru.ValidatorAutobuz;
import adapterTerestru.ValidatorTerestru;

public class Main {
	
	static void valideazaBiletCalatorie(ValidatorTerestru validatorTerestru) {
		validatorTerestru.valideazaBilet();
	}

	public static void main(String[] args) {
		
		//adapter de tip  clasa
		ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
		valideazaBiletCalatorie(validatorAutobuz);
		
		//ValidatorMetrou validatorMetrou =new ValidatorMetrou();
		//valideazaBiletCalatorie(validatorMetrou);
		
		ValidatorAdapter validatorAdapter= new ValidatorAdapter();
		valideazaBiletCalatorie(validatorAdapter);
		
		//adapter de tip obiect
		ValidatorMetrou validatorMetrou=new ValidatorMetrou();
		AdapterObiecte adapterObiecte=new AdapterObiecte(validatorMetrou);
		
		valideazaBiletCalatorie(adapterObiecte);

	}

}
