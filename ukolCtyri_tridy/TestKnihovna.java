package ukolCtyri_tridy;

public class TestKnihovna {
  public static void main(String[] args) {
    Autor autor = new Autor("Karel Čapek");

    Kniha kniha1 = new Kniha("R.U.R.", autor);
    Kniha kniha2 = new Kniha("Válka s mloky", autor);

    Ctenar ctenar = new Ctenar("Jan Novák");

    ctenar.vypujcitKnihu(kniha1);
    ctenar.vypujcitKnihu(kniha2);

    ctenar.vypujcitKnihu(kniha1);

    ctenar.vypsatSeznamKnih();

    ctenar.vratitKnihu(kniha1);

    ctenar.vypsatSeznamKnih();
  }
}