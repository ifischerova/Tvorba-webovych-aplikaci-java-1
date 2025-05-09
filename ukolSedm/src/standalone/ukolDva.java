package ukolSedm.src.standalone;
import java.util.Scanner;

public class ukolDva {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    jednoduchaPodminka(scanner);
    pristupPodleVeku(scanner);
    hodnoceniZnamek(scanner);
    vstupenkaDoKina(scanner);
    prestupnyRok(scanner);
    overeniHesla(scanner);
    overeniHeslaCyklem(scanner);
    sudaNeboLichaCisla(scanner);
    vypocetBMI(scanner);
    stupneObtiznosti(scanner);
    urceniKategoriiProduktu(scanner);
    operatorModVBankomatu(scanner);
    operatorModVBankomatuBonus(scanner);

    scanner.close();
  }

  // Napište program, který porovná dvě čísla a vypíše, které z nich je větší, nebo zda jsou obě čísla stejná.
  public static void jednoduchaPodminka(Scanner scanner) {
    System.out.print("Zadejte první číslo: ");
    int cislo1 = scanner.nextInt();
    System.out.print("Zadejte druhé číslo: ");
    int cislo2 = scanner.nextInt();

    if (cislo1 > cislo2) {
        System.out.println("První číslo (" + cislo1 + ") je větší než druhé číslo (" + cislo2 + ").");
    } else if (cislo1 < cislo2) {
        System.out.println("Druhé číslo (" + cislo2 + ") je větší než první číslo (" + cislo1 + ").");
    } else {
        System.out.println("Obě čísla jsou stejná (" + cislo1 + ").");
    }
  }

  // Napište program, který na základě věku rozhodne, zda osoba může řídit auto. Předpokládejme, že minimální věk je 18 let.
  public static void pristupPodleVeku(Scanner scanner) {
    System.out.print("Zadejte věk osoby: ");
    int vek = scanner.nextInt();

    if (vek >= 18) {
        System.out.println("Osoba s věkem " + vek + " může řídit auto.");
    } else {
        System.out.println("Osoba s věkem " + vek + " nemůže řídit auto.");
    }
  }

  // Napište program, který podle získaného skóre (v procentech) určí známku studenta: A (90–100%), B (80–89%), C (70–79%), D (60–69%) a F (pod 60%).
  public static void hodnoceniZnamek(Scanner scanner) {
    System.out.print("Zadejte skóre studenta (v procentech): ");
    int skore = scanner.nextInt();

    if (skore >= 90 && skore <= 100) {
        System.out.println("Známka: A");
    } else if (skore >= 80 && skore < 90) {
        System.out.println("Známka: B");
    } else if (skore >= 70 && skore < 80) {
        System.out.println("Známka: C");
    } else if (skore >= 60 && skore < 70) {
        System.out.println("Známka: D");
    } else if (skore < 60) {
        System.out.println("Známka: F");
    } else {
        System.out.println("Neplatné skóre.");
    }
  }

  // Napište program, který na základě věku rozhodne o ceně vstupenky do kina. Děti do 12 let mají vstup zdarma, dospělí od 12 do 64 let platí plnou cenu a senioři nad 65 let mají slevu.

  public static void vstupenkaDoKina(Scanner scanner) {
    System.out.print("Zadejte věk osoby: ");
    int vek = scanner.nextInt();

    if (vek < 12) {
        System.out.println("Vstup zdarma.");
    } else if (vek >= 12 && vek <= 64) {
        System.out.println("Plná cena vstupenky.");
    } else {
        System.out.println("Sleva pro seniory.");
    }
  }

  // Napište program, který zjistí, zda je zadaný rok přestupný. Rok je přestupný, pokud je dělitelný 4, ale není dělitelný 100, kromě případů, kdy je dělitelný 400.
  public static void prestupnyRok(Scanner scanner) {
    System.out.print("Zadejte rok: ");
    int rok = scanner.nextInt();

    if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
      System.out.println(rok + " je přestupný rok.");
    } else {
      System.out.println(rok + " není přestupný rok.");
    }
  }

  // Napište program, který ověří, zda zadané heslo splňuje následující kritéria: minimálně 8 znaků, obsahuje alespoň jedno velké písmeno a jednu číslici.

  // Reseni s regexem 
  public static void overeniHesla(Scanner scanner) {
    System.out.print("Zadejte heslo: ");
    String heslo = scanner.next();

    if (heslo.length() >= 8 && heslo.matches(".*[A-Z].*") && heslo.matches(".*\\d.*")) {
        System.out.println("Heslo je platné.");
    } else {
        System.out.println("Heslo není platné.");
    }
  }

  // Reseni s cyklem
  public static void overeniHeslaCyklem(Scanner scanner) {
    System.out.print("Zadejte heslo: ");
    String heslo = scanner.next();
    boolean maVelkePismeno = false;
    boolean maCislici = false;

    if (heslo.length() >= 8) {
        for (char znak : heslo.toCharArray()) {
            if (Character.isUpperCase(znak)) {
                maVelkePismeno = true;
            }
            if (Character.isDigit(znak)) {
                maCislici = true;
            }
        }
    }

    if (maVelkePismeno && maCislici) {
        System.out.println("Heslo je platné.");
    } else {
        System.out.println("Heslo není platné.");
    }
  }

  // Napište program, který zjistí, zda je zadané číslo sudé nebo liché.
  public static void sudaNeboLichaCisla(Scanner scanner) {
    System.out.print("Zadejte číslo: ");
    int cislo = scanner.nextInt();

    if (cislo % 2 == 0) {
        System.out.println(cislo + " je sudé.");
    } else {
        System.out.println(cislo + " je liché.");
    }
  }

  /* Napište program, který spočítá Body Mass Index (BMI) na základě zadané váhy v kilogramech a výšky v metrech a určí, zda je osoba podvážná, má normální váhu, je nadvážná nebo obézní podle standardních BMI kategorií. */
  public static void vypocetBMI(Scanner scanner) {
    System.out.print("Zadejte váhu v kilogramech: ");
    double vaha = scanner.nextDouble();
    System.out.print("Zadejte výšku v metrech: ");
    double vyska = scanner.nextDouble();
    
    double bmi = vaha / (vyska * vyska);
    System.out.printf("Váš BMI je: %.2f%n", bmi);
    
    if (bmi < 18.5) {
      System.out.println("Podváha.");
    } else if (bmi >= 18.5 && bmi < 24.9) {
      System.out.println("Normální váha.");
    } else if (bmi >= 25 && bmi < 29.9) {
      System.out.println("Nadváha.");
    } else {
      System.out.println("Obezita.");
    }
  }

  /* Napište program, který na základě číselné hodnoty (1–3) vypíše stupeň obtížnosti úkolu: 1 pro 'lehký', 2 pro 'střední', 3 pro 'těžký'. */
  public static void stupneObtiznosti(Scanner scanner) {
    System.out.print("Zadejte číslo (1-3): ");
    int obtiznost = scanner.nextInt();

    switch (obtiznost) {
      case 1:
        System.out.println("Obtížnost: lehký.");
        break;
      case 2:
        System.out.println("Obtížnost: střední.");
        break;
      case 3:
        System.out.println("Obtížnost: těžký.");
        break;
      default:
        System.out.println("Neplatná volba.");
    }
  }

  /* Napište program, který podle kódu produktu určí jeho kategorii.Předpokládejme, že kódy jsou: 1 pro 'Elektronika', 2 pro 'Domácnost', 3 pro 'Hračky', 4 pro 'Oblečení'. Jakýkoliv jiný kód nebude rozpoznán. */
  public static void urceniKategoriiProduktu(Scanner scanner) {
    System.out.print("Zadejte kód produktu (1-4): ");
    int kod = scanner.nextInt();

    switch (kod) {
      case 1:
        System.out.println("Kategorie: Elektronika.");
        break;
      case 2:
        System.out.println("Kategorie: Domácnost.");
        break;
      case 3:
        System.out.println("Kategorie: Hračky.");
        break;
      case 4:
        System.out.println("Kategorie: Oblečení.");
        break;
      default:
        System.out.println("Neznámý kód produktu.");
    }
  }

  /* Napište program, který vydá určitý počet bankovek z bankomatu. Př. na vstupu je cílová částka, na výstupu soupis počtu jednotlivých bankovek. Př.: Vstup - Vyber 3800 Kč. Výstup – 3 krát 1000 Kč, 1 krát 500, 1 krát 200, 1 krát 100. */
  public static void operatorModVBankomatu(Scanner scanner) {
    System.out.print("Zadejte částku k výběru: ");
    int castka = scanner.nextInt();

    int[] bankovky = {1000, 500, 200, 100, 50, 20, 10};
    System.out.println("Vydané bankovky:");

    for (int bankovka : bankovky) {
        int pocet = castka / bankovka;
        if (pocet > 0) {
            System.out.println(pocet + " krát " + bankovka + " Kč");
            castka %= bankovka;
        }
    }
  }

  /* Bonus - Jako bonus přidejte ověření, že lze vybírat násobky 100. Druhý bonus spočívá v tom, že si ověřujete, kolik bankovek v bankomatu ještě zbývá, např. v bankomatu nejsou žádné tisícikorunu, ale je tam dostatečný počet 500 Kč bankovek atp.*/
  public static void operatorModVBankomatuBonus(Scanner scanner) {
    System.out.print("Zadejte částku k výběru (násobek 100): ");
    int castka = scanner.nextInt();

    if (castka % 100 != 0) {
        System.out.println("Částka musí být násobek 100.");
        return;
    }

    int[] bankovky = {1000, 500, 200, 100, 50, 20, 10};
    int[] dostupneBankovky = {0, 5, 10, 20, 30, 50, 100}; // Předpokládaný počet bankovek v bankomatu
    System.out.println("Vydané bankovky:");

    for (int i = 0; i < bankovky.length; i++) {
        int bankovka = bankovky[i];
        int pocet = Math.min(castka / bankovka, dostupneBankovky[i]);
        if (pocet > 0) {
            System.out.println(pocet + " krát " + bankovka + " Kč");
            castka -= pocet * bankovka;
        }
    }

    if (castka > 0) {
        System.out.println("V bankomatu nen9 dost bankovek.");
    }
  }


}