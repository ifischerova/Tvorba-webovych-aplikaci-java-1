public class ukolJedna {
  public static void main(String[] args) {
      // Spuštění jednotlivých Příkladů
      helloWorld(); 
      vypocetSouctu();
      vypisCeleJmeno(); 
      vypocetObvoduKruhu();
      prevodTeploty();
      jeJavaZabavna();
      konkatenaceRetezcu();
      pocitani(); 
      pretypovani();
      vypocetPrumeru();
  }

  // Příklad 1: Napište program v Javě, který vypíše "Hello, World!" na standardní výstup.
  public static void helloWorld() {
      System.out.println("Hello, World!");
  }

  /* Příklad 2: Deklarujte dvě celočíselné proměnné, a a b. Přiřaďte jim hodnoty 5 a 10. Vytiskněte jejich součet.*/
  public static void vypocetSouctu() {
      int a = 5; 
      int b = 10;
      int sum = a + b; // Výpočet součtu
      System.out.println("Součet a + b je: " + sum); // Výpis součtu
  }

  /* Příklad 3: Vytvořte dvě proměnné typu String, firstName a lastName. Přiřaďte jim vaše křestní jméno a příjmení. Vytiskněte je společně jako celé jméno. Dejte si pozor na mezery. */
  public static void vypisCeleJmeno() {
      String firstName = "Iva"; 
      String lastName = "Fischerová"; 
      String fullName = firstName + " " + lastName;
      System.out.println("Celé jméno je: " + fullName); 
  }

/* Příklad 4: Deklarujte proměnnou radius typu double s libovolnou hodnotou. Vypočítejte a vytiskněte obvod kruhu použitím radius. Použijte 3.14 jako aproximaci pro π. */
  public static void vypocetObvoduKruhu() {
    double radius = 5.0; 
    double pi = 3.14; 
    double circumference = 2 * pi * radius; // Výpočet obvodu kruhu
    System.out.println("Obvod kruhu s poloměrem " + radius + " je: " + circumference); 
  }

/* Příklad 5: Převeďte teplotu 100 stupňů Fahrenheit na stupně Celsius pomocí vzorce C = (F-32)x5/9. Výsledek vytiskněte. */
  public static void prevodTeploty() {
    double fahrenheit = 100.0;
    double celsius = (fahrenheit - 32) * 5 / 9;
    System.out.println(fahrenheit + " stupňů Fahrenheit je " + celsius + " stupňů Celsius."); 
}


/* Příklad 6: Deklarujte boolean proměnnou isJavaFun a přiřaďte jí hodnotu true. Vytiskněte její hodnotu na konzoli. */
  public static void jeJavaZabavna() {
    boolean isJavaFun = true; 
    System.out.println("Je Java zábavná? " + isJavaFun);
}

/*Příklad 7: Spojte (konkatenace) dva řetězce "Java" a "Programming" do jednoho a vytiskněte výsledek. */
  public static void konkatenaceRetezcu() {
    String str1 = "Java"; 
    String str2 = "Programming"; 
    String result = str1 + " " + str2; 
    System.out.println("Spojený řetězec: " + result); 
}

/* Příklad 8: Vytvořte proměnné x a y s libovolnými celočíselnými hodnotami. Vypočítejte a vytiskněte jejich součet, rozdíl, součin a podíl. */
public static void pocitani() {
  int x = 12; 
  int y = 4;  

  int sum = x + y; 
  int difference = x - y; 
  int product = x * y;
  int quotient = x / y; 

  System.out.println("Součet: " + sum);
  System.out.println("Rozdíl: " + difference);
  System.out.println("Součin: " + product);
  System.out.println("Podíl: " + quotient);
}
/* Příklad 9: Deklarujte proměnnou typu int s hodnotou 100 a přetypujte ji na typ double. Výsledek vytiskněte.*/ 

  /* Příklad 9: Deklarujte proměnnou typu int s hodnotou 100 a přetypujte ji na typ double. Výsledek vytiskněte. */
  public static void pretypovani() {
    int intValue = 100;
    double doubleValue = (double) intValue;
    System.out.println("Hodnota int: " + intValue);
    System.out.println("Hodnota po přetypování na double: " + doubleValue);
}
/* Příklad 10:Vytvořte tři proměnné typu double, num1, num2, a num3 s libovolnými hodnotami. Vypočítejte a vytiskněte jejich průměr.*/
   public static void vypocetPrumeru() {
    double num1 = 4.5; 
    double num2 = 7.8; 
    double num3 = 10.2; 

    double prumer = (num1 + num2 + num3) / 3; 
    System.out.println("Průměr čísel " + num1 + ", " + num2 + " a " + num3 + " je: " + prumer); 
}
}