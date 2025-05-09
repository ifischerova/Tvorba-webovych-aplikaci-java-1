package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public class TestSkola {
  public static void main(String[] args) {
    Trida trida = new Trida("3.A");

    Student student1 = new Student("Jan", "Novák", trida);
    Student student2 = new Student("Petr", "Svoboda", trida);

    Rozvrh rozvrh = new Rozvrh(trida);

    rozvrh.pridatPredmet(new Predmet("Matematika", "Pondělí 8:00-9:30"));
    rozvrh.pridatPredmet(new Predmet("Fyzika", "Úterý 10:00-11:30"));

    System.out.println("Třída: " + trida.getOznaceni());
    System.out.println("Studenti:");
    for (Student student : trida.getStudenti()) {
      System.out.println("- " + student.getJmeno() + " " + student.getPrijmeni());
    }

    System.out.println("Rozvrh:");
    for (Predmet predmet : rozvrh.getPredmety()) {
      System.out.println("- " + predmet.getNazev() + " (" + predmet.getCasovySlot() + ")");
    }
  }
}