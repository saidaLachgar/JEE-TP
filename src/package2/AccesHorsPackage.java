package package2;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle{

	public static void main(String[] args) {
		Salle b = new Salle(3, "Salle B");
		// System.out.println(b.nom+" id:"+b.id);
	}
	
	public void afficher(Salle s) {
		//System.out.println(s.id);
		//System.out.println(s.nom);
		System.out.println(id);
		System.out.println(nom);
	}
}
