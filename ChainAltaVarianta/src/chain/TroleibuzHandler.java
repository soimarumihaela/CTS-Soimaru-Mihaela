package chain;

public class TroleibuzHandler extends MijlocTransportHandler {

	public TroleibuzHandler(int pragSuperior) {
		super(pragSuperior);
		
	}

	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta<super.pragSuperior) {
			System.out.println("Se recomanda utilizarea troleibuzului pentru o distanta mai mica de "+distanta+" km");
		}
		else {
			super.getUrmatorulMijlocTransportHandler().recomandaMijlocTransport(distanta);
		}
		
	}

}
