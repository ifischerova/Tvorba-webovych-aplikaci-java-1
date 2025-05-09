package ukolPet_polymorfismus;

public class UzivatelController extends BaseController {
  @Override
  public String getBasePath() {
    return "/api/uzivatele";
  }

  @Override
  public void obsluzZadost() {
    System.out.println("Obsluhuji žádost pro uživatele.");
  }
}