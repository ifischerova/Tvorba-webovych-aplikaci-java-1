package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public class Predmet {
  private String nazev;
  private String casovySlot; // Např. "Pondělí 8:00-9:30"

  public Predmet(String nazev, String casovySlot) {
    this.nazev = nazev;
    this.casovySlot = casovySlot;
  }

  public String getNazev() {
    return nazev;
  }

  public String getCasovySlot() {
    return casovySlot;
  }
}