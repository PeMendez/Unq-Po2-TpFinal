package ar.edu.unq.po2.tpfinal;

public class AreaCircular {
	
	//Pablo
	//no logre usar la clase Area que se puede importar, porque no supe como "darle forma de circulo", investique y no pude. Asi que la cree.
	//le puse AreaCircular porque Area era muy general y no quise tener que hacer una superclase, creo que excede el enunciado.

	private int latitud;
	private int longitud;
	private int radio;
	// private Coordenada cordenada; 

	public AreaCircular(int latitud, int longitud, int radio) {
		this.setLatitud(latitud);
		this.setLongitud(longitud);
		this.setRadio(radio);
	}

	private int getLatitud() {
		return this.latitud;
	}

	private void setLatitud(int latitud) {
		this.latitud = latitud;
	}

	private int getLongitud() {
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

		return Math.sqrt(Math.pow(Math.abs(coordenada.getX() - this.getLatitud()), 2)
				+ Math.pow(Math.abs(coordenada.getY() - this.getLongitud()), 2)) < this.getRadio();
	}
}
