package ukolCtyri_tridy;

public class TestOsoba{
  public static void main(String[] args) {
    Osoba osoba = new Osoba("Karel", "Novák", 30);
    System.out.println("Jmeno: " + osoba.getJmeno());
    System.out.println("Prijmeni: " + osoba.getPrijmeni());
    System.out.println("Vek: " + osoba.getVek());

    System.out.println("\nPokouším se nastavit záporný věk...");
    osoba.setVek(-5);

    System.out.println("\nVolam metodu pozdrav:");
    osoba.pozdrav();
    }
}