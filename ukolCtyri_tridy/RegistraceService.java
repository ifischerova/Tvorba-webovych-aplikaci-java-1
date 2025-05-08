package ukolCtyri_tridy;

public class RegistraceService {

  public UzivatelEntita registrujUzivatele(UzivatelDTO dto) throws NeplatnaDataException {
    if (dto.getEmail() == null || !dto.getEmail().contains("@")) {
      throw new NeplatnaDataException("Email musí obsahovat '@'.");
    }

    return new UzivatelEntita(null, dto.getJmeno(), dto.getEmail());
  }
}