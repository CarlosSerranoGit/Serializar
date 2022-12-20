import Utils.LocalStorage;
import model.Agenda;
import model.Dato;
//prueba
public class Ejecutable2 {
	public static void main(String[] args) {
		Agenda agenda = LocalStorage.read("agenda.txt");
		if(agenda != null) {
			System.out.println(agenda);
		}else {
			System.out.println("Error en lectura");
		}
	}
}
