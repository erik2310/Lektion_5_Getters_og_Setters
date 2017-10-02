package erik2310;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Bord bord = new Bord();

        System.out.println("Materialet er: " + bord.getMateriale());
        bord.setMateriale("Træ");
        System.out.println("Materialet er nu sat til: " + bord.getMateriale());
    }
}
