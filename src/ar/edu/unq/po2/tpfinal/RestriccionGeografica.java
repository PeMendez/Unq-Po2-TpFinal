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

	@Override
	public boolean seCumple(Muestra muestra) {
		return (Math.sqrt(Math.pow(Math.abs(muestra.getCoordenada().getLatitud() - this.getCoordenada().getLatitud()), 2)
				+ Math.pow(Math.abs(muestra.getCoordenada().getLongitud() - this.getCoordenada().getLongitud()), 2))) <= this
						.getRadio();
	}

}
