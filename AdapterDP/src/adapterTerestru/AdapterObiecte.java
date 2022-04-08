package adapterTerestru;

import adapterSubteran.ValidatorMetrou;

public class AdapterObiecte implements ValidatorTerestru {
	ValidatorMetrou validatorMetrou=new ValidatorMetrou();
	
	@Override
	public void valideazaBilet() {
		validatorMetrou.valideazaCalatorie();
	}

	@Override
	public void valideazaAbonament() {
	 validatorMetrou.valideazaAbonament();
		
	}

	public AdapterObiecte(ValidatorMetrou validatorMetrou) {
		
		this.validatorMetrou = validatorMetrou;
	}
	

}
