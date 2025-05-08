package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.time.LocalDate;

public class TestKnihovna {
  public static void main(String[] args) {
    Autor autor1 = new Autor("Neznamy Autor");
    Autor autor2 = new Autor("Neznama Autorka");

    Kniha kniha1 = new Kniha("Aristokratka", "123456789", 200);
    Kniha kniha2 = new Kniha("Staflik a Spagetka", "987654321", 300);

    kniha1.pridatAutora(autor1);
    kniha2.pridatAutora(autor1);
    kniha2.pridatAutora(autor2);

    Uzivatel uzivatel = new Uzivatel("Jan", "Novák");

    Vypujcka vypujcka = new Vypujcka(kniha1, uzivatel, LocalDate.now());

    System.out.println("Kniha: " + vypujcka.getKniha().getNazev());
    System.out.println("Vypůjčeno uživatelem: " + vypujcka.getUzivatel().getJmeno() + " " + vypujcka.getUzivatel().getPrijmeni());
    System.out.println("Datum vypůjčení: " + vypujcka.getDatumVypujceni());
  }
}