package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public class UzivatelProdukt {
  private String jmeno;
  private String prijmeni;
  private String dodaciAdresa;
  private String fakturacniUdaje;

  public UzivatelProdukt(String jmeno, String prijmeni, String dodaciAdresa, String fakturacniUdaje) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.dodaciAdresa = dodaciAdresa;
    this.fakturacniUdaje = fakturacniUdaje;
  }

  public String getJmeno() {
    return jmeno;
  }

  public String getPrijmeni() {
    return prijmeni;
  }

  public String getDodaciAdresa() {
    return dodaciAdresa;
  }

  public String getFakturacniUdaje() {
    return fakturacniUdaje;
  }
}