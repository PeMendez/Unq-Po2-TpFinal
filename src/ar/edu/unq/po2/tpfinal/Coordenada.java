package ar.edu.unq.po2.tpfinal;

public class Coordenada {

	private int x;
	private int y;

	public Coordenada(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return this.x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	private void setY(int y) {
		this.y = y;
	}

}
