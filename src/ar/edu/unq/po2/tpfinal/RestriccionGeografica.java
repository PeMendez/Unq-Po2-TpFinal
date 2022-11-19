package ar.edu.unq.po2.tpfinal;

public class RestriccionGeografica {
	
	private int latitud;
	private int longitud;
	private int radio;

	public RestriccionGeografica(int latitud, int longitud, int radio) {
		this.setLatitud(latitud);
		this.setLongitud(longitud);
		this.setRadio(radio);
	}

	public int getLatitud() {
		return this.latitud;
	}

	private void setLatitud(int latitud) {
		this.latitud = latitud;
	}

	public int getLongitud() {
		return this.longitud;
	}

	private void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getRadio() {
		return this.radio;
	}

	private void setRadio(int radio) {
		this.radio = radio;
	}

	public boolean contiene(Coordenada coordenada) {
		return Math.sqrt(Math.pow(Math.abs(coordenada.getLatitud() - this.getLatitud()), 2)
				+ Math.pow(Math.abs(coordenada.getLongitud() - this.getLongitud()), 2)) < this.getRadio();
	}
}
