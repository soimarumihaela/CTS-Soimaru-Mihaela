package builder;

public class Autobuz {
	private String model;
	private String numeSofer;
	private boolean oprireCapat;
	private boolean deshideUsi;
	private String textDerulat;
	private String nrInmatriculare;
	
	
	
	public Autobuz() {
		super();
		this.model = "Mercedes";
		this.numeSofer = "Dorel";
		this.oprireCapat = true;
		this.deshideUsi = true;
		this.textDerulat = "STB - in miscare";
		this.nrInmatriculare = "B55STB";
	}
	
	 void setModel(String model) {
		this.model = model;
	}
	 void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}
	 void setOprireCapat(boolean oprireCapat) {
		this.oprireCapat = oprireCapat;
	}
	 void setDeshideUsi(boolean deshideUsi) {
		this.deshideUsi = deshideUsi;
	}
	 void setTextDerulat(String textDerulat) {
		this.textDerulat = textDerulat;
	}
 void setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [model=");
		builder.append(model);
		builder.append(", numeSofer=");
		builder.append(numeSofer);
		builder.append(", oprireCapat=");
		builder.append(oprireCapat);
		builder.append(", deshideUsi=");
		builder.append(deshideUsi);
		builder.append(", textDerulat=");
		builder.append(textDerulat);
		builder.append(", nrInmatriculare=");
		builder.append(nrInmatriculare);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
