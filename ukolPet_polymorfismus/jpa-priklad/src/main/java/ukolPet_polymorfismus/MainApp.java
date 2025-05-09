package ukolPet_polymorfismus;

import jakarta.persistence.*;

import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("defaultPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        ObjednavkaEntity objednavka = new ObjednavkaEntity("OBJ123");
        ProduktEntity produkt = new ProduktEntity("Kniha", new BigDecimal("199.99"));
        UzivatelEntity uzivatel = new UzivatelEntity("Petr", "petr@example.com");

        em.persist(objednavka);
        em.persist(produkt);
        em.persist(uzivatel);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
