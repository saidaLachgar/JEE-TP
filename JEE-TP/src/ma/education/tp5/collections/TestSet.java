package ma.education.tp5.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		set1.add("ABC1");
		set1.add("ABC2");
		set1.add("ABC3");
		set1.add("ABC1");
		set1.add("ABC4");
		set1.add("ABC5");
		set1.forEach(i-> System.out.println(i));
		
		// une Set set2 qui contient des objets de la classe Client.
		Set<Client> set2 = new HashSet<Client>();
		set2.add(new Client(1,"ALAMI"));
		set2.add(new Client(1,"ALAMI"));
		set2.add(new Client(2,"SOUHAIL"));
		set2.forEach(i-> System.out.println(i));
		
		//l'implémentation TreeSet fait le tri
		Set<Integer> set3 = new TreeSet<>();
		set3.add(22);
		set3.add(11);
		set3.add(15);
		set3.add(9);
		set3.forEach(i-> System.out.println(i));
		
		//les objets ne sont pas comparable (aucun critère de comparaison) --> une erreur d'exécution
		Set<Client> set4 = new TreeSet<>();
		set4.add(new Client(1,"OMAR"));
		set4.add(new Client(3,"SAID"));
		set4.add(new Client(2,"HASSAN"));
		set4.forEach(i-> System.out.println(i));

	}

}