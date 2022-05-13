package chain;

public class MetrouHandler extends MijlocTransportHandler {

	public MetrouHandler(int pragSuperior) {
		super(pragSuperior);
	}

	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta<super.pragSuperior) {
		System.out.println("Este recomandata folosirea metroului pentru distanta de "+distanta+" km.");
		}
		else {
			super.urmatorulMijlocTransportHandler.recomandaMijlocTransport(distanta);
		}
		
	}

}
