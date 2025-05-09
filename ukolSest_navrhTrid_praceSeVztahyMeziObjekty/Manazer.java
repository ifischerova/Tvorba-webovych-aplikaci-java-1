package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public class Manazer extends Zamestnanec {
  private String oddeleni;

  public Manazer(String jmeno, String osobniCislo, String oddeleni) {
    super(jmeno, osobniCislo);
    this.oddeleni = oddeleni;
  }

  public String getOddeleni() {
    return oddeleni;
  }

  public void setOddeleni(String oddeleni) {
    this.oddeleni = oddeleni;
  }

  @Override
  public String getPopis() {
    return "Manažer: " + getJmeno() + ", osobní číslo: " + getOsobniCislo() + ", oddělení: " + oddeleni;
  }
}