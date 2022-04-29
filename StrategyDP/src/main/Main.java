package main;

import strategy.CardBancar;
import strategy.Sms;
import strategy.ValidatorCalatorie;

public class Main {

	public static void main(String[] args) {
		ValidatorCalatorie validatorCalatorie=new ValidatorCalatorie(3);
		validatorCalatorie.platesteCalatorie();
		
		validatorCalatorie.setModPlata(new CardBancar());
		validatorCalatorie.platesteCalatorie();
		validatorCalatorie.setModPlata(new Sms());
		validatorCalatorie.platesteCalatorie();

	}

}
