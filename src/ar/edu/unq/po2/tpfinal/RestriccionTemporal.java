package ar.edu.unq.po2.tpfinal;

import java.time.LocalDate;

public class RestriccionTemporal {
	
	private String tipo;
	private Date inicio;
	private Date fin;
	
	
	public void RestriccionTempora(String tipo) {
		this.setTipo(tipo);
		this.setInicio(Date(1900/01/01)); // una fecha ridiculamente vieja
		this.setFin(Date(3000/01/01)); // una fecha ridiculamente futura
		
	}
	public void RestriccionTempora(Date inicio, Date fin) {
		this.setTipo("algo que incluya a ambas");
		this.setInicio(inicio); // una fecha ridiculamente vieja
		this.setFin(fin); // una fecha ridiculamente futura
		
	}
	
	public void RestriccionTempora(String tipo, Date inicio, Date fin) {
		this.setTipo(tipo);
		this.setInicio(inicio); // una fecha ridiculamente vieja
		this.setFin(fin); // una fecha ridiculamente futura
		
	}


	private String getTipo() {
		return tipo;
	}


	private void setTipo(String tipo) {
		this.tipo = tipo;
	}


	private Date getInicio() {
		return inicio;
	}


	private void setInicio(Date inicio) {
		this.inicio = inicio;
	}


	private Date getFin() {
		return fin;
	}


	private void setFin(Date fin) {
		this.fin = fin;
	}

//	public boolean estaHabilitado(Date fecha) {
//		switch (this.tipo) {
//		case "diasHabiles":
//			return fecha.esDiaHabil() && fecha.after(inicio) && fecha.before(fin);
//			break;
//		case "finDeSemana":
//			return fecha.esFinDeSemana() && fecha.after(inicio) && fecha.before(fin);
//			break;
//		}
//	}
}
