package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.time.LocalDate;

public class TestOsobaAdresa {
  public static void main(String[] args) {
    // Vytvoření adresy
    Adresa adresa = new Adresa("Dlouhá 12", "Praha", "11000");

    // Vytvoření osoby s adresou
    Osoba osoba = new Osoba("Jan", "Novák", LocalDate.of(1990, 5, 15), adresa);

    // Výpis informací o osobě
    osoba.vypisInformace();
  }
}