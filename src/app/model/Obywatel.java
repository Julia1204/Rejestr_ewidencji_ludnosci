package model;

import java.util.Objects;

public class Obywatel {
    private int id;
    private String imie;
    private String nazwisko;
    private String pesel;
    private String dataUrodzenia;
    private String ulica;
    private int nrDomu;
    private String miasto;
    private String kodPocztowy;
    private String stanCywilny;
    private String wyksztalcenie;
    private String plec;
    private String numerDokumentu;
    private String obywatelstwo;
    private String ststusSluzby;
    private String pozwolenieNaBron;

    public Obywatel(int id, String imie, String nazwisko, String pesel, String dataUrodzenia, String ulica, int nrDomu,
                    String miasto,String kodPocztowy, String stanCywilny, String wyksztalcenie, String plec,
                    String numerDokumentu, String obywatelstwo, String ststusSluzby, String pozwolenieNaBron) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.dataUrodzenia = dataUrodzenia; //yyyy-mm-dd
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.stanCywilny = stanCywilny;
        this.wyksztalcenie = wyksztalcenie;
        this.plec = plec;
        this.numerDokumentu = numerDokumentu;
        this.obywatelstwo = obywatelstwo;
        this.ststusSluzby = ststusSluzby;
        this.pozwolenieNaBron = pozwolenieNaBron;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getPesel() {return pesel;}
    public void setPesel(String pesel) {this.pesel = pesel;}
    public String getDataUrodzenia() {
        return dataUrodzenia;
    }
    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
    public String getUlica() {
        return ulica;
    }
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }
    public int getNrDomu() {
        return nrDomu;
    }
    public void setNrDomu(int nrDomu) {
        this.nrDomu = nrDomu;
    }
    public String getMiasto() {
        return miasto;
    }
    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }
    public String getKodPocztowy() {
        return kodPocztowy;
    }
    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }
    public String getStanCywilny() {
        return stanCywilny;
    }
    public void setStanCywilny(String stanCywilny) {
        this.stanCywilny = stanCywilny;
    }
    public String getWyksztalcenie() {
        return wyksztalcenie;
    }
    public void setWyksztalcenie(String wyksztalcenie) {
        this.wyksztalcenie = wyksztalcenie;
    }
    public String getPlec() {
        return plec;
    }
    public void setPlec(String plec) {
        this.plec = plec;
    }
    public String getNumerDokumentu() {
        return numerDokumentu;
    }
    public void setNumerDokumentu(String numerDokumentu) {
        this.numerDokumentu = numerDokumentu;
    }
    public String getObywatelstwo() {
        return obywatelstwo;
    }
    public void setObywatelstwo(String obywatelstwo) {
        this.obywatelstwo = obywatelstwo;
    }
    public String getStstusSluzby() {
        return ststusSluzby;
    }
    public void setStatusSluzby(String ststusSluzby) {
        this.ststusSluzby = ststusSluzby;
    }
    public String getPozwolenieNaBron() {
        return pozwolenieNaBron;
    }
    public void setPozwolenieNaBron(String pozwolenieNaBron) {
        this.pozwolenieNaBron = pozwolenieNaBron;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obywatel obywatel = (Obywatel) o;
        return id == obywatel.id && nrDomu == obywatel.nrDomu && Objects.equals(imie, obywatel.imie) && Objects.equals(nazwisko, obywatel.nazwisko) && Objects.equals(pesel, obywatel.pesel) && Objects.equals(dataUrodzenia, obywatel.dataUrodzenia) && Objects.equals(ulica, obywatel.ulica) && Objects.equals(miasto, obywatel.miasto) && Objects.equals(kodPocztowy, obywatel.kodPocztowy) && Objects.equals(stanCywilny, obywatel.stanCywilny) && Objects.equals(wyksztalcenie, obywatel.wyksztalcenie) && Objects.equals(plec, obywatel.plec) && Objects.equals(numerDokumentu, obywatel.numerDokumentu) && Objects.equals(obywatelstwo, obywatel.obywatelstwo) && Objects.equals(ststusSluzby, obywatel.ststusSluzby) && Objects.equals(pozwolenieNaBron, obywatel.pozwolenieNaBron);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, nazwisko, pesel, dataUrodzenia, ulica, nrDomu, miasto, kodPocztowy, stanCywilny, wyksztalcenie, plec, numerDokumentu, obywatelstwo, ststusSluzby, pozwolenieNaBron);
    }
}
