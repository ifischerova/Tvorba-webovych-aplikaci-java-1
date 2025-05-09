package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.util.ArrayList;
import java.util.List;

public class Trida {
  private String oznaceni;
  private List<Student> studenti; // One-to-Many vztah
  private Rozvrh rozvrh; // One-to-One vztah

  public Trida(String oznaceni) {
    this.oznaceni = oznaceni;
    this.studenti = new ArrayList<>();
  }

  public String getOznaceni() {
    return oznaceni;
  }

  public List<Student> getStudenti() {
    return studenti;
  }

  public Rozvrh getRozvrh() {
    return rozvrh;
  }

  public void setRozvrh(Rozvrh rozvrh) {
    this.rozvrh = rozvrh;
  }

  public void pridatStudenta(Student student) {
    studenti.add(student);
  }
}