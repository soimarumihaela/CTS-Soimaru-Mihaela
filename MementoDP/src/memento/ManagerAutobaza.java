package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobaza {
	
	List<AutobuzMemento> listaAutobuzeMemento;
	
	public ManagerAutobaza() {
		listaAutobuzeMemento= new ArrayList();
	}

	public ManagerAutobaza(List<AutobuzMemento> listaAutobuzMemento) {
		
		this.listaAutobuzeMemento = listaAutobuzMemento;
	}
	
	public void add(AutobuzMemento a) {
		listaAutobuzeMemento.add(a);
	}
	
	public AutobuzMemento getMemento(int poz) {
		return listaAutobuzeMemento.get(poz);
	}
	
	//autobuz.undo(manger.getMemento(0));
	
	//System.out.println();
	
	

}
