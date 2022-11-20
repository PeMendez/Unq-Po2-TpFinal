package ar.edu.unq.po2.tpfinal;

public class RestriccionGeografica extends Coordenada implements IRestriccion {
	
	private int radio;

	public RestriccionGeografica(int latitud, int longitud, int radio) {
		super(latitud,longitud);
		this.setRadio(radio);
	}

	public int getRadio() {
		return this.radio;
	}

	private void setRadio(int radio) {
		this.radio = radio;
	}

	public boolean seCumple(Muestra muestra) {
		return Math.sqrt(Math.pow(Math.abs(muestra.getCoordenada().getLatitud() - this.getLatitud()), 2)
				+ Math.pow(Math.abs(muestra.getCoordenada().getLongitud() - this.getLongitud()), 2)) < this.getRadio();
	}
}
