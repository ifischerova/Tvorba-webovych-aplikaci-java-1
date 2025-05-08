package ukolCtyri_tridy;

public class TestUzivatel {
  public static void main(String[] args) {
    UzivatelService uzivatelService = new UzivatelService();

    UzivatelDTO uzivatelDTO = new UzivatelDTO("imatsion", "imatsion@seznam.cz");

    UzivatelEntita uzivatelEntita = uzivatelService.vytvorUzivatele(uzivatelDTO);

    System.out.println("Entita byla vytvořena:");
    System.out.println("Jméno: " + uzivatelEntita.getJmeno());
    System.out.println("Email: " + uzivatelEntita.getEmail());
  }
}
