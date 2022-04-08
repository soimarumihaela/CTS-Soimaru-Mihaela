package adapterTerestru;

import adapterSubteran.ValidatorMetrou;

public class ValidatorAdapter extends ValidatorMetrou implements ValidatorTerestru {
	
	@Override
	public void valideazaBilet() {
		super.valideazaCalatorie();
	}
}
