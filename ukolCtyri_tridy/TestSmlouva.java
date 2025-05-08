package ukolCtyri_tridy;

public class TestSmlouva {
  public static void main(String[] args) {
    Adresa adresa = new Adresa("Pytlounova 15", "Praha", "11000");

    Zakaznik zakaznik = new Zakaznik("Jan", "Novák", adresa);

    Smlouva smlouva = new Smlouva("SM12345", zakaznik, false);

    System.out.println("Detaily smlouvy:");
    System.out.println("Číslo smlouvy: " + smlouva.getCisloSmlouvy());
    System.out.println("Zákazník: " + zakaznik.getJmeno() + " " + zakaznik.getPrijmeni());
    System.out.println("Adresa: " + zakaznik.getAdresa().getUlice() + ", " + zakaznik.getAdresa().getMesto() + ", " + zakaznik.getAdresa().getPsc());
    System.out.println("Stav smlouvy: " + (smlouva.aktivni() ? "Aktivní" : "Neaktivní"));

    smlouva.aktivujSmlouvu(smlouva.aktivni());

    System.out.println("\nPo aktivaci smlouvy:");
    System.out.println("Stav smlouvy: " + (smlouva.aktivni() ? "Aktivní" : "Neaktivní"));
  }
}