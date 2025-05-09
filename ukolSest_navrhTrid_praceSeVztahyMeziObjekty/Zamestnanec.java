package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public abstract class Zamestnanec {
  private String jmeno;
  private String osobniCislo;

  public Zamestnanec(String jmeno, String osobniCislo) {
    this.jmeno = jmeno;
    this.osobniCislo = osobniCislo;
  }

  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public String getOsobniCislo() {
    return osobniCislo;
  }

  public void setOsobniCislo(String osobniCislo) {
    this.osobniCislo = osobniCislo;
  }

  public abstract String getPopis(); // Abstraktní metoda, kterou implementují specializované třídy
}