package ukolPet_polymorfismus;

public class ProduktController extends BaseController {
  @Override
  public String getBasePath() {
    return "/api/produkty";
  }

  @Override
  public void obsluzZadost() {
    System.out.println("Obsluhuji žádost pro produkty.");
  }
}