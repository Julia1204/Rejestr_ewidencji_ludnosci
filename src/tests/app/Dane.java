package app;

import model.Uzytkownik;
import model.Obywatel;


public class Dane {

    public int daneUzytkownikaId[] = {1, 2, 3};
    public String daneUzytkownikaLogin[] = {"login1", "login2", "login3"};
    public String daneUzytkownikaHaslo[] = {"haslo1", "haslo2", "haslo3"};
    public String daneUzytkownikaUprawnienia[] = {"pracownik", "pracownik", "pracownik"};

    public int[] testStatus = {1, 2, 3};

    public Obywatel testowiObywatele[] = {new Obywatel(1, "julia", "gosciniak",
            "121212", "2001-02-12", "Legnicka", 2, "Wroclaw",
            "63-900", "singiel", "średnie", "kobieta",
            "3232", "polskie", "nie", "nie"),
            new Obywatel(2, "julia", "gosciniak",
                    "121212", "2001-02-12", "Legnicka", 2, "Wroclaw",
                    "63-900", "singiel", "średnie", "kobieta",
                    "3232", "polskie", "nie", "nie")};

    public Uzytkownik testowiUzytkownicy[] = {new Uzytkownik(1, "login1", "haslo1", "pracownik"),
    new Uzytkownik(2, "login2", "haslo2", "pracownik")};

    public String opcjeZarzadzania[] = {"Dodaj","Usun","Modyfikuj"};


}
