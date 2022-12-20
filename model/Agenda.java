package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Agenda implements Serializable{
	List<Dato> datos;

	public Agenda(List<Dato> datos) {
		this.datos = datos;
	}
	public Agenda() {
		this(new ArrayList<>());
	}
	public List<Dato> getDatos() {
		return datos;
	}
	public void setDatos(List<Dato> datos) {
		this.datos = datos;
	}
	@Override
	public String toString() {
		return "Agenda [datos=" + datos + "]";
	}
	
	
}
