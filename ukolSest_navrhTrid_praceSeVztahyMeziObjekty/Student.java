package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public class Student {
  private String jmeno;
  private String prijmeni;
  private Trida trida; // Many-to-One vztah

  public Student(String jmeno, String prijmeni, Trida trida) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.trida = trida;
    trida.pridatStudenta(this); // Přidání studenta do třídy
  }

  public String getJmeno() {
    return jmeno;
  }

  public String getPrijmeni() {
    return prijmeni;
  }

  public Trida getTrida() {
    return trida;
  }

  public void setTrida(Trida trida) {
    this.trida = trida;
  }
}