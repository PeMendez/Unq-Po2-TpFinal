package ar.edu.unq.po2.tpfinal;

public class Coordenada {

	private int latitud;
	private int longitud;

	public Coordenada(int latitud, int longitud) {
		this.setLatitud(latitud);
		this.setLongitud(longitud);
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

}
