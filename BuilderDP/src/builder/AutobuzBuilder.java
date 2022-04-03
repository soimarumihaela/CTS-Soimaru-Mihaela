package builder;

public class AutobuzBuilder implements Builder{
	
	private Autobuz instanta;
	@Override
	public Autobuz build() {
		
		return instanta;
	}
	
	public AutobuzBuilder() {
		
		this.instanta=new Autobuz();
	}
	
	public AutobuzBuilder setModel(String model) {
		instanta.setModel(model);
		return this;
	}
	public AutobuzBuilder setNumeSofer(String numeSofer) {
		instanta.setNumeSofer(numeSofer);
		return this;
	}
	public AutobuzBuilder setOprireCapat(boolean oprireCapat) {
		instanta.setOprireCapat(oprireCapat);
		return this;
	}
	public AutobuzBuilder setDeshideUsi(boolean deshideUsi) {
		instanta.setDeshideUsi(deshideUsi);
		return this;
	}
	public AutobuzBuilder setTextDerulat(String textDerulat) {
		instanta.setTextDerulat(textDerulat);
		return this;
	}
	public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
		instanta.setNrInmatriculare(nrInmatriculare);
		return this;
	}
}
