package ar.edu.unq.po2.tpfinal;

import java.time.LocalDate;
import java.util.Date;

public class RestriccionTemporal {
	
	private String tipo;
	private LocalDate inicio;
	private LocalDate fin;
	
	
	public void RestriccionTemporal(String tipo) {
		this.setTipo(tipo);
		this.setInicio(LocalDate.of(1900,01,01)); // una fecha ridiculamente vieja
		this.setFin(LocalDate.of(3000,01,01)); // una fecha ridiculamente futura
		
	}
	public void RestriccionTemporal(LocalDate inicio, LocalDate fin) {
		this.setTipo("algo que incluya a ambas");
		this.setInicio(inicio); // una fecha ridiculamente vieja
		this.setFin(fin); // una fecha ridiculamente futura
		
	}
	
	public void RestriccionTemporal(String tipo, LocalDate inicio, LocalDate fin) {
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


	private LocalDate getInicio() {
		return inicio;
	}


	private void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}


	private LocalDate getFin() {
		return fin;
	}


	private void setFin(LocalDate fin) {
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
