package system;

import model.Obywatel;
import model.Uzytkownik;
import model.Wniosek;


import java.util.Scanner;

import static java.lang.System.exit;

public class SystemEwidencjiLudnosci {

    SystemWnioskow systemWnisokow = new SystemWnioskow();
    SystemObywateli systemObywateli = new SystemObywateli();
    SystemUzytkownikow systemUzytkownikow = new SystemUzytkownikow();

    public SystemEwidencjiLudnosci(SystemUzytkownikow systemUzytkownikow, SystemObywateli systemObywateli) {
        this.systemUzytkownikow = systemUzytkownikow;
        this.systemObywateli = systemObywateli;
    }

    public SystemEwidencjiLudnosci() {

    }

    public SystemUzytkownikow getSystemUzytkownikow() {
        return systemUzytkownikow;
    }

    public SystemObywateli getSystemObywateli() {
        return systemObywateli;
    }

    public SystemWnioskow zlozWniosek(Wniosek.RodzajWniosku rodzaj, String dane) {
        int id = systemWnisokow.pobierzOstatniIndeks();
        if (rodzaj.equals(Wniosek.RodzajWniosku.DODANIE)) {
            systemWnisokow.dodajWniosekDodanieDanych(id, dane);
            System.out.println("Wniosek o dodanie nowych danch został złożony");
        } else if (rodzaj.equals(Wniosek.RodzajWniosku.USUNIECIE)) {
            systemWnisokow.dodajWniosekUsuniecieDanych(id, dane);
            System.out.println("Wniosek o usunięcie danych został złożony");
        } else if (rodzaj.equals(Wniosek.RodzajWniosku.MODYFIKACJA)) {
            systemWnisokow.dodajWniosekModyfikacjaDanych(id, dane);
            System.out.println("Wniosek o modyfikacje danych został złożony");
        }
        return systemWnisokow;
    }

    public void zarzadzajDanymi(String rodzaj, int id) {
        String imie;
        String nazwisko;
        String pesel;
        String dataUrodzenia;
        String ulica;
        int nrDomu;
        String miasto;
        String kodPocztowy;
        String stanCywilny;
        String wyksztalcenie;
        String plec;
        String numerDokumentu;
        String obywatelstwo;
        String statusSluzby;
        String pozwolenieNaBron;
        if (rodzaj.equals("Dodaj")) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj imię");
            imie = scan.nextLine();
            System.out.println("Podaj nazwisko");
            nazwisko = scan.nextLine();
            System.out.println("Podaj pesel");
            pesel = scan.nextLine();
            System.out.println("Podaj datę urodzenia");
            dataUrodzenia = scan.nextLine();
            System.out.println("Podaj ulicę z adresu");
            ulica = scan.nextLine();
            System.out.println("Podaj nr domu z adresu");
            nrDomu = scan.nextInt();
            System.out.println("Podaj miasto");
            miasto = scan.nextLine();
            System.out.println("Podaj kod Pocztowy");
            kodPocztowy = scan.nextLine();
            System.out.println("Podaj stan cywilny");
            stanCywilny = scan.nextLine();
            System.out.println("Podaj wyksztalcenie");
            wyksztalcenie = scan.nextLine();
            System.out.println("Podaj plec");
            plec = scan.nextLine();
            System.out.println("Podaj numer dokumentu");
            numerDokumentu = scan.nextLine();
            System.out.println("Podaj obywatelstwo");
            obywatelstwo = scan.nextLine();
            System.out.println("Podaj status służby wojskowej");
            statusSluzby = scan.nextLine();
            System.out.println("Podaj czy jest pozwolenie na broń");
            pozwolenieNaBron = scan.nextLine();

            systemObywateli.dodajObywatela(id, imie, nazwisko, pesel, dataUrodzenia, ulica, nrDomu,
                    miasto, kodPocztowy, stanCywilny, wyksztalcenie, plec, numerDokumentu, obywatelstwo,
                    statusSluzby, pozwolenieNaBron);
            System.out.println("Dodano obywatela");


        } else if (rodzaj.equals("Usun")) {

            systemObywateli.usunObywatela(id);

        } else if (rodzaj.equals("Modyfikuj")) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj nowe dane:");
            System.out.println("Podaj imię");
            imie = scan.nextLine();
            System.out.println("Podaj nazwisko");
            nazwisko = scan.nextLine();
            System.out.println("Podaj datę urodzenia");
            dataUrodzenia = scan.nextLine();
            System.out.println("Podaj ulicę z adresu");
            ulica = scan.nextLine();
            System.out.println("Podaj nr domu z adresu");
            nrDomu = scan.nextInt();
            System.out.println("Podaj miasto");
            miasto = scan.nextLine();
            System.out.println("Podaj kod Pocztowy");
            kodPocztowy = scan.nextLine();
            System.out.println("Podaj stan cywilny");
            stanCywilny = scan.nextLine();
            System.out.println("Podaj wyksztalcenie");
            wyksztalcenie = scan.nextLine();
            System.out.println("Podaj plec");
            plec = scan.nextLine();
            System.out.println("Podaj numer dokumentu");
            numerDokumentu = scan.nextLine();
            System.out.println("Podaj obywatelstwo");
            obywatelstwo = scan.nextLine();
            System.out.println("Podaj status służby wojskowej");
            statusSluzby = scan.nextLine();
            System.out.println("Podaj czy jest pozwolenie na broń");
            pozwolenieNaBron = scan.nextLine();

            systemObywateli.modyfikujObywatela(id, imie, nazwisko, dataUrodzenia, ulica, nrDomu, miasto, kodPocztowy,
                    stanCywilny, wyksztalcenie, plec, numerDokumentu, obywatelstwo, statusSluzby,
                    pozwolenieNaBron);
        }

    }

    public void zarzadzajDanymi(int id, String imie, String nazwisko, String pesel, String dataUrodzenia,
                                String ulica, int nrDomu, String miasto, String kodPocztowy, String stanCywilny,
                                String wyksztalcenie, String plec, String numerDokumentu, String obywatelstwo,
                                String statusSluzby, String pozwolenieNaBron) {

        systemObywateli.dodajObywatela(id, imie, nazwisko, pesel, dataUrodzenia, ulica, nrDomu,
                miasto, kodPocztowy, stanCywilny, wyksztalcenie, plec, numerDokumentu, obywatelstwo,
                statusSluzby, pozwolenieNaBron);

    }

    public int zalogujSie() {
        int status;
        String loginUzytkownika;
        String hasloUzytkownika;
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj dane logowania");
        System.out.println("login:");
        loginUzytkownika = skan.nextLine();
        System.out.println("haslo:");
        hasloUzytkownika = skan.nextLine();
        int wynik = systemUzytkownikow.sprawdzDaneLogowania(loginUzytkownika, hasloUzytkownika);
//        boolean[] test = systemUzytkownikow.sprawdzDaneLogowania(loginUzytkownika, hasloUzytkownika);
//        if (test[0] == true && test[1] == true) {
//            return status = 1;
//        } else if (test[0] == true && test[1] == false) {
//            return status = 2;
//        } else {
//            return status = 3;
//        }
        return wynik;
    }

    public int zalogujSie(String login, String haslo) {
        int wynik;
        return systemUzytkownikow.sprawdzDaneLogowania(login, haslo);
    }

    public void pobierzDane() {
        System.out.println("\n\nJakie dane chcesz wyświetlić?");
        System.out.println("Statystyka dotycząca liczby singli - 1\n" +
                "Statystyka dotycząca liczby osób o konkretnej płci - 2\n" +
                "Statystyka dotycząca liczby urodzonych w danycm roku - 3\n" +
                "Statystyka dotycząca mieszkańców daneg miasta - 4\n" +
                "Statystyka dotycząca wykształcenia obywateli - 5\n" +
                "Statystyka dotycząca odbytej służby wojskowej - 6\n" +
                "Statystyka dotycząca pozwolenia na broń - 7\n");


        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj jedną z dostępnych opcji");
        int statystyka;
        statystyka = wejscie.nextInt();
        switch (statystyka) {
            case 1:
                systemObywateli.ileSingli();
                break;

            case 2:
                systemObywateli.ilePlec();
                break;
            case 3:
                System.out.println("Podaj rok dla którego sprawdzić liczbę urodzeń");
                int rok = wejscie.nextInt();
                systemObywateli.ileurodzonych(rok);
                break;
            case 4:
                System.out.println("Podaj nazwę miasta dla którego wyświetlić statystykę");
                wejscie.nextLine();
                String misato = wejscie.nextLine();
                systemObywateli.mieszkancyMiasta(misato);
                break;
            case 5:
                System.out.println("Podaj rodzaj wyksztalcenia dla którego wyświetlić ststystykę (podstawowe, średnie, wyższe");
                wejscie.nextLine();
                String wyksztalcenie = wejscie.nextLine();
                systemObywateli.ileWyksztalcenie(wyksztalcenie);
                break;
            case 6:
                System.out.println("Podaj informacje dla jakich wyświetlić statystyke. Odbyta służba wojskowa - tak/nie");
                wejscie.nextLine();
                String czyOdbytaSluzba = wejscie.nextLine();
                systemObywateli.statystykiWojsko(czyOdbytaSluzba);
                break;
            case 7:
                System.out.println("Podaj odpowiednią wartość, dla której wyświetlićstatystyki, odnośnie pozwolenia na broń." +
                        "Posiada pozwolenie - tak/ nie posiada pozwolenia - nie");
                wejscie.nextLine();
                String czyMaPozwolenie = wejscie.nextLine();
                systemObywateli.ilePozwolenNaBron(czyMaPozwolenie);
                break;
        }

    }

    public float pobierzDane(int statystyka) {

            if (statystyka==1) {
                return systemObywateli.ileSingli();
            }
            else if (statystyka==2) {
                return systemObywateli.ilePlec();
            }
//            else if (statystyka==3) {
//
//                return systemObywateli.ileurodzonych(rok);
//            }
//            else if (statystyka==4) {
//                return systemObywateli.mieszkancyMiasta(misato);
//            }
//            else if (statystyka==5) {
//                return systemObywateli.ileWyksztalcenie(wyksztalcenie);
//            }
//            else if (statystyka==6) {
//                return systemObywateli.statystykiWojsko(czyOdbytaSluzba);
//                }
//           else if (statystyka==7) {
//                return systemObywateli.ilePozwolenNaBron(czyMaPozwolenie);
//           }
           else return 0;
    }

    public Obywatel pobierzDaneOsobiste(int id) {
        Obywatel model = systemObywateli.pobierzObywatela(id);
        System.out.println(model.getImie());
        System.out.println(model.getNazwisko());
        System.out.println(model.getPesel());
        System.out.println(model.getDataUrodzenia());
        System.out.println(model.getUlica());
        System.out.println(model.getNrDomu());
        System.out.println(model.getMiasto());
        System.out.println(model.getKodPocztowy());
        System.out.println(model.getStanCywilny());
        System.out.println(model.getWyksztalcenie());
        System.out.println(model.getPlec());
        System.out.println(model.getNumerDokumentu());
        System.out.println(model.getStanCywilny());
        System.out.println(model.getObywatelstwo());
        System.out.println(model.getStstusSluzby());
        System.out.println(model.getPozwolenieNaBron());

        return model;
    }

    public Uzytkownik zarzadzajUzytkownikiem(int id, String dane[]) {
        return systemUzytkownikow.dodajUzytkownika(id, dane[0], dane[1], dane[2]);
    }

    public void menu() {
        int wybor, id;
        int opcja = 0, status = 0;
        String julia, dane;
        System.out.println("\nWitaj w rejestrze ewidencji ludności\n" +
                "\nWybierz odpowiednią opcję:\n" +
                "Zaloguj sie - 1\n" +
                "Wyświetl statystyki - 2\n");
        Scanner zarzadzanie = new Scanner(System.in);
        Scanner wejscie = new Scanner(System.in);
        wybor = wejscie.nextInt();

        if (wybor == 1) {
            status = zalogujSie();
        } else if (wybor == 2) {
            pobierzDane();
            exit(0);
        }
        while (opcja != 6) {
            if (status == 1) { //pracownik
                System.out.println("\n\nWyświetl statystyki - 2");
                System.out.println("Zażądzaj danymi - 3");
                System.out.println("Wyświetl dane osobiste - 4");
                System.out.println("Wyjście - 6");
                opcja = wejscie.nextInt();
                if (opcja == 2) {
                    pobierzDane();
                } else if (opcja == 3) {
                    System.out.println("podaj rodzaj");
                    julia = zarzadzanie.nextLine();
                    System.out.println("podaj id");
                    id = zarzadzanie.nextInt();
                    zarzadzajDanymi(julia, id);
                } else if (opcja == 4) {
                    System.out.println("Podaj id");
                    id = zarzadzanie.nextInt();
                    pobierzDaneOsobiste(id);
                } else if (opcja == 5) {
                    System.out.println("Podaj rodzaj");
                    julia = zarzadzanie.nextLine();
                    System.out.println("Podaj dane");
                    dane = zarzadzanie.nextLine();
                    zlozWniosek(Wniosek.RodzajWniosku.valueOf(julia), dane);
                } else if (opcja == 6) {
                    exit(0);
                }
            } else if (status == 2) { //użytkownik
                System.out.println("\n\nWyświetl statystyki - 2");
                System.out.println("Wyświetl dane osobiste - 4");
                System.out.println("Złóż wniosek - 5");
                System.out.println("Wyjście - 6");
                opcja = wejscie.nextInt();
                if (opcja == 2) {
                    pobierzDane();
                } else if (opcja == 3) {
                    System.out.println("podaj rodzaj");
                    julia = zarzadzanie.nextLine();
                    System.out.println("podaj id");
                    id = zarzadzanie.nextInt();
                    zarzadzajDanymi(julia, id);
                } else if (opcja == 4) {
                    System.out.println("Podaj id");
                    id = zarzadzanie.nextInt();
                    pobierzDaneOsobiste(id);
                } else if (opcja == 5) {
                    System.out.println("Podaj rodzaj");
                    julia = zarzadzanie.nextLine();
                    System.out.println("Podaj dane");
                    dane = zarzadzanie.nextLine();
                    zlozWniosek(Wniosek.RodzajWniosku.valueOf(julia), dane);
                } else if (opcja == 6) {
                    exit(0);
                }
            }
        }

    }

    public static void main(String[] args) {
        SystemEwidencjiLudnosci systemEwidencjiLudnosci = new SystemEwidencjiLudnosci();

        systemEwidencjiLudnosci.systemUzytkownikow.dodajUzytkownika(1, "julia", "julia", "pracownik");
        systemEwidencjiLudnosci.systemObywateli.dodajObywatela(1, "julia", "gosciniak",
                "121212", "2001-02-12", "Legnicka", 2, "Wroclaw",
                "63-900", "singiel", "średnie", "kobieta",
                "3232", "polskie", "nie", "nie");

        systemEwidencjiLudnosci.menu();


    }
}