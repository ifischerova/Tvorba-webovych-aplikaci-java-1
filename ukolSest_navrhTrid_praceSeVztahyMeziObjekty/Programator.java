package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.util.List;

public class Programator extends Zamestnanec {
  private List<String> programovaciJazyky;

  public Programator(String jmeno, String osobniCislo, List<String> programovaciJazyky) {
    super(jmeno, osobniCislo);
    this.programovaciJazyky = programovaciJazyky;
  }

  public List<String> getProgramovaciJazyky() {
    return programovaciJazyky;
  }

  public void setProgramovaciJazyky(List<String> programovaciJazyky) {
    this.programovaciJazyky = programovaciJazyky;
  }

  @Override
  public String getPopis() {
    return "Programátor: " + getJmeno() + ", osobní číslo: " + getOsobniCislo() + ", programovací jazyky: " + programovaciJazyky;
  }
}