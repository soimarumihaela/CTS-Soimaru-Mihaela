package chain;

public class TroleibuzHandler extends MijlocTransportHandler {

	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta<3) {
			System.out.println("Se recomanda utilizarea troleibuzului pentru o distanta mai mica de "+distanta+" km");
		}
		else {
			super.getUrmatorulMijlocTransportHandler().recomandaMijlocTransport(distanta);
		}
		
	}

}
