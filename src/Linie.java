public class Linie {

    // Deklarer 2 punkter
    private Punkt punkt1;
    private Punkt punkt2;

    // En constructor til at sætte de 2 punkter
    public Linie(Punkt punkt1, Punkt punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }

    // En metode til at udregne linjens længde
    public double length() {
        return Math.sqrt((punkt1.getX() - punkt2.getX()) * (punkt1.getX() - punkt2.getX()) + (punkt1.getY() - punkt2.getY()) * (punkt1.getY() - punkt2.getY()));
    }

}
