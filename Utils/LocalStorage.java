package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Agenda;
import model.Dato;

public class LocalStorage {
	public static boolean write(String file, Agenda agenda) {
		boolean result = false;
		File f = new File(file);
		try {
			FileOutputStream fout = new FileOutputStream(f);
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(agenda);
			result = true;
			oout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	public static Agenda read (String file) {
		Agenda result = null;
		File f = new File(file);
		try {
			FileInputStream fin =new FileInputStream(f);
			ObjectInputStream oin = new ObjectInputStream(fin);
			result=(Agenda)oin.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
}
