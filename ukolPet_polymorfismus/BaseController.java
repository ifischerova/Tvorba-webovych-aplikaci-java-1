package ukolPet_polymorfismus;

public abstract class BaseController {
  public abstract String getBasePath(); // Abstraktní metoda, kterou musí potomci implementovat

  public void vypisEndpointInfo() {
    System.out.println("Controller endpoint: " + getBasePath());
  }

  public abstract void obsluzZadost(); // Abstraktní metoda pro obsluhu žádosti
}