package ukolCtyri_tridy;

public class TestValidace {
  public static void main(String[] args) {
    RegistraceService registraceService = new RegistraceService();

    try {
      UzivatelDTO neplatnyDTO = new UzivatelDTO("Jan", "test");
      UzivatelEntita uzivatel = registraceService.registrujUzivatele(neplatnyDTO);
      System.out.println("Uživatel byl registrován: " + uzivatel.getJmeno() + ", " + uzivatel.getEmail());
    } catch (NeplatnaDataException e) {
      System.out.println("Chyba: " + e.getMessage());
    }

    try {
      UzivatelDTO platnyDTO = new UzivatelDTO("Petr", "petr@example.com");
      UzivatelEntita uzivatel = registraceService.registrujUzivatele(platnyDTO);
      System.out.println("Uživatel byl registrován: " + uzivatel.getJmeno() + ", " + uzivatel.getEmail());
    } catch (NeplatnaDataException e) {
      System.out.println("Chyba: " + e.getMessage());
    }
  }
}