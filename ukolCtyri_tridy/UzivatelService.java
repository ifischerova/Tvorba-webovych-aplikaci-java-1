package ukolCtyri_tridy;

public class UzivatelService {
  public UzivatelEntita vytvorUzivatele(UzivatelDTO dto) {
    return new UzivatelEntita(null, dto.getJmeno(), dto.getEmail());
  }
}
