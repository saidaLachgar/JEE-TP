package ma.education.tp3.singleton;

public class Terre {
    double distanceToSoleil, surface;
    private static Terre instance;

    private Terre(double distanceToSoleil, double surface) {
        this.distanceToSoleil = distanceToSoleil;
        this.surface = surface;
    }

    public static Terre getInstance(double distanceToSoleil, double surface) {
        if (instance == null)
            instance = new Terre(distanceToSoleil, surface);
        return instance;
    }

    public static void main(String[] args) {
    }
}
