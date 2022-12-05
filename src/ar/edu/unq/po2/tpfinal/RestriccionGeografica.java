package ar.edu.unq.po2.tpfinal;

public class RestriccionGeografica implements IRestriccion {

	private Coordenada coordenada;
	private int radio;

	public RestriccionGeografica(Coordenada coordenada, int radio) {
		this.setCoordenada(coordenada);
		this.setRadio(radio);
	}

	public Coordenada getCoordenada() {
		return this.coordenada;
	}

	private void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public int getRadio() {
		return this.radio;
	}

	private void setRadio(int radio) {
		this.radio = radio;
	}

	private int getLatitud() {
		return this.getCoordenada().getLatitud();
	}

	private int getLongitud() {
		return this.getCoordenada().getLongitud();
	}

	@Override
	public boolean seCumple(Muestra muestra) {
		return (Math.sqrt(Math.pow(Math.abs(muestra.getCoordenada().getLatitud() - this.getLatitud()), 2) + Math
				.pow(Math.abs(muestra.getCoordenada().getLongitud() - this.getLongitud()), 2))) <= this
						.getRadio();
	}

}
