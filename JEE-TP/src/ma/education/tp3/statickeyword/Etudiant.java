package ma.education.tp3.statickeyword;

public class Etudiant {
    public long id;
    public String nom;
    static int nbEtudiants;

    public Etudiant (long id, String nom,int nb) {
        this.id = id;
        this.nom = nom;
        nbEtudiants+=nb;
    }

    public static void main(String[] args) {

    }
}
