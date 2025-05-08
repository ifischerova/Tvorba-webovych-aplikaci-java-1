package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.util.ArrayList;
import java.util.List;

public class Autor {
  private String jmeno;
  private List<Kniha> knihy; // Many-to-Many vztah

  public Autor(String jmeno) {
    this.jmeno = jmeno;
    this.knihy = new ArrayList<>();
  }

  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public List<Kniha> getKnihy() {
    return knihy;
  }

  public void pridatKnihu(Kniha kniha) {
    if (!knihy.contains(kniha)) {
      knihy.add(kniha);
      kniha.pridatAutora(this); // Obousměrná vazba
    }
  }
}