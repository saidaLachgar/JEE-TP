package package2;

import java.util.Scanner;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle{

	public static void main(String[] args) {
		Salle b = new Salle(3, "Salle B");
		// System.out.println(b.nom+" id:"+b.id);
		Scanner s = new Scanner(System.in);
		System.out.println("hi There, type your name please");
		System.out.println("uuh so your name is "+s.nextLine()+"! cool i like it");
	}
	
	public void afficher(Salle s) {
		//System.out.println(s.id);
		//System.out.println(s.nom);
		System.out.println(id);
		System.out.println(nom);
	}
}
