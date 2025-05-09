package ukolPet_polymorfismus;

public class ObjednavkaController extends BaseController {
  @Override
  public String getBasePath() {
    return "/api/objednavky";
  }

  @Override
  public void obsluzZadost() {
    System.out.println("Obsluhuji žádost pro objednávky.");
  }
}