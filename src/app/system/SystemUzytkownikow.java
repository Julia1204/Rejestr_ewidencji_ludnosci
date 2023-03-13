package system;

import model.Uzytkownik;

import java.util.ArrayList;

import java.util.List;

public class SystemUzytkownikow {
    private List<Uzytkownik> uzytkownicy;

    public SystemUzytkownikow(){
        this.uzytkownicy = new ArrayList<>();
    }

    public List<Uzytkownik> getUzytkownicy() {return uzytkownicy;}
    public void setUzytkownicy(List<Uzytkownik> uzytkownicy) {this.uzytkownicy = uzytkownicy;}

    public int sprawdzDaneLogowania (String login, String haslo){
        int status=0;
        boolean czyZalogowany = false;
        boolean czyPracownik = false;
        for (Uzytkownik uzytkownik : uzytkownicy){
            if (login.equals(uzytkownik.getLogin()) && haslo.equals(uzytkownik.getHaslo())) {
                if (uzytkownik.getRodzajUprawnienia().equals("pracownik")){
                    czyPracownik = true;
                }
                czyZalogowany = true;
                break;
            }
        }

        if(czyZalogowany==true && czyPracownik==true){
            return status = 1;
        } else if (czyZalogowany == true && czyPracownik == false) {
            return status = 2;
        } else {
        System.out.println("Nieprawidlowy login lub haslo");
            return status = 3;
        }
        //return new boolean[] {czyZalogowany, czyPracownik};
    }

    public Uzytkownik dodajUzytkownika(int id, String login, String haslo, String rodzajUprawnien){
        Uzytkownik uzytkownik = new Uzytkownik(id,login,haslo,rodzajUprawnien);
        uzytkownicy.add(uzytkownik);
        return uzytkownik;
    }

    public Uzytkownik pobierzUzytkownika(int id){
        return uzytkownicy.get(id);
    }

}
