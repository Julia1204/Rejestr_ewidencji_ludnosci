package testyfitnesse;
import fit.ColumnFixture;
public class TestDodawanieObywatela extends ColumnFixture {
    int id;
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


    public boolean dodajObywatela(){
        int s1 = liczbaObywateli();
        SetUp.systemEwidencjiLudnosci.zarzadzajDanymi(id, imie, nazwisko, pesel, dataUrodzenia, ulica, nrDomu, miasto, kodPocztowy,
                stanCywilny, wyksztalcenie, plec, numerDokumentu, obywatelstwo, statusSluzby,
                pozwolenieNaBron);
        int s2 = liczbaObywateli();
        return (SetUp.systemEwidencjiLudnosci.pobierzDaneOsobiste(id-1)) != null && s1!=s2;
    }

    public int liczbaObywateli() {
        return SetUp.systemEwidencjiLudnosci.getSystemObywateli().getObywatele().size();
}

}
