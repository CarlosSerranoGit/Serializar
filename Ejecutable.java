import java.util.ArrayList;
import java.util.List;

import Utils.LocalStorage;
import model.Agenda;
import model.Dato;

public class Ejecutable {
	public static void main(String[] args) {
		List<Dato> datos =new ArrayList<>();
		Dato dato = new Dato("Juan","1234");
		Dato dato2 = new Dato("María","8975");
		datos.add(dato);
		datos.add(dato2);
		Agenda agenda = new Agenda(datos);
		
		//guardar dato en un archivo
		if(LocalStorage.write("agenda.txt", agenda)) {
			System.out.println("Guardado correctamente");
		}else {
			System.out.println("Error al escribir");
		}
		
		
		//leer de un archivo el dato
	}
}
