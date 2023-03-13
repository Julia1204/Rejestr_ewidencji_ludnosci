package model;

public class Wniosek {

    private int id;
    private RodzajWniosku rodzaj;
    private String status;
    private String dane;

    public enum RodzajWniosku{
        DODANIE,
        USUNIECIE,
        MODYFIKACJA;
    }

    public Wniosek(int id, RodzajWniosku rodzaj, String status, String dane) {
        this.id = id;
        this.rodzaj = rodzaj;
        this.status = status;
        this.dane = dane;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public RodzajWniosku getRodzaj() {
        return rodzaj;
    }
    public void setRodzaj(RodzajWniosku rodzaj) {
        this.rodzaj = rodzaj;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
