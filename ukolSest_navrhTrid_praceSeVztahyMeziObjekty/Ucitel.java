package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.util.List;

public class Ucitel extends Zamestnanec {
  private List<String> predmety;

  public Ucitel(String jmeno, String osobniCislo, List<String> predmety) {
    super(jmeno, osobniCislo);
    this.predmety = predmety;
  }

  public List<String> getPredmety() {
    return predmety;
  }

  public void setPredmety(List<String> predmety) {
    this.predmety = predmety;
  }

  @Override
  public String getPopis() {
    return "Učitel: " + getJmeno() + ", osobní číslo: " + getOsobniCislo() + ", předměty: " + predmety;
  }
}