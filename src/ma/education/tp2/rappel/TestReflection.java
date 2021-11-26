package ma.education.tp2.rappel;

import java.lang.reflect.*;
import java.util.ResourceBundle;

public class TestReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		// Lecture fichier des paramètres
		ResourceBundle rb = ResourceBundle.getBundle("ma.education.tp2.rappel.param");
		String value = rb.getString("keyClass1");
		// Convert String type To Class Type
		Class c = Class.forName(value);
		// Tableau pour les constructeurs de la classe ConnectionDB
		Constructor[] constructors = c.getDeclaredConstructors();
		// Modification de la visibilité du premier constructeur
		constructors[0].setAccessible(true);
		// Instanciation de l’Objet (o) par réflexion.
		Object o = constructors[0].newInstance(null);
	}

}
