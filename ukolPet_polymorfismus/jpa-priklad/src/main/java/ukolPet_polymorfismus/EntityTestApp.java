package ukolPet_polymorfismus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EntityTestApp {
    public static void main(String[] args) {
        List<BaseEntity> seznam = new ArrayList<>();

        ProduktEntity produkt = new ProduktEntity("Notebook", new BigDecimal("29999.99"));
        UzivatelEntity uzivatel = new UzivatelEntity("Alena", "alena@example.com");

        seznam.add(produkt);
        seznam.add(uzivatel);

        for (BaseEntity entita : seznam) {
            System.out.println(entita.getEntityType());
        }
    }
}
