package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

public abstract class CompuestoBinario extends CondicionDeBusqueda {
	
	private CondicionDeBusqueda condicion1;
	private CondicionDeBusqueda condicion2;
	
	
	public CondicionDeBusqueda getCondicion1() {
		return condicion1;
	}
	public void setCondicion1(CondicionDeBusqueda condicion1) {
		this.condicion1 = condicion1;
	}
	public CondicionDeBusqueda getCondicion2() {
		return condicion2;
	}
	public void setCondicion2(CondicionDeBusqueda condicion2) {
		this.condicion2 = condicion2;
	}

}
