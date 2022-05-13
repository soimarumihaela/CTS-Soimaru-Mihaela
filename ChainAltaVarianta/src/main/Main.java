package main;

import chain.AutobuzHandler;
import chain.MetrouHandler;
import chain.MijlocTransportHandler;
import chain.TramvaiHandler;
import chain.TroleibuzHandler;

public class Main {

	public static void main(String[] args) {
		MijlocTransportHandler handlerAutobuz=new AutobuzHandler(6);
		MijlocTransportHandler handlerMetrou=new MetrouHandler(5000);
		MijlocTransportHandler handlerTramvai=new TramvaiHandler(10);
		MijlocTransportHandler handlerTroleibuz=new TroleibuzHandler(4);
		
		handlerTroleibuz.setUrmatorulMijlocTransportHandler(handlerAutobuz);
		handlerAutobuz.setUrmatorulMijlocTransportHandler(handlerTramvai);
		handlerTramvai.setUrmatorulMijlocTransportHandler(handlerMetrou);
		
		handlerTroleibuz.recomandaMijlocTransport(2);
		handlerTroleibuz.recomandaMijlocTransport(6);
		handlerTroleibuz.recomandaMijlocTransport(11);
		System.out.println("CLUUUJJJJJ");
		
		MijlocTransportHandler handlerAutobuzCluj=new AutobuzHandler(2000);
		MijlocTransportHandler handlerMetrouCluj=new MetrouHandler(2);
		MijlocTransportHandler handlerTramvaiCluj=new TramvaiHandler(4);
		MijlocTransportHandler handlerTroleibuzCluj=new TroleibuzHandler(6);
		
		handlerMetrouCluj.setUrmatorulMijlocTransportHandler(handlerAutobuzCluj);
		handlerAutobuzCluj.setUrmatorulMijlocTransportHandler(handlerTramvaiCluj);
		handlerTramvaiCluj.setUrmatorulMijlocTransportHandler(handlerTroleibuzCluj);
		handlerTroleibuzCluj.setUrmatorulMijlocTransportHandler(handlerMetrouCluj);
		
		handlerMetrouCluj.recomandaMijlocTransport(3);
		handlerMetrouCluj.recomandaMijlocTransport(1);
		handlerMetrouCluj.recomandaMijlocTransport(12);
		
		
		

	}

}
