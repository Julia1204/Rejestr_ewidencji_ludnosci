package model;

import java.util.Objects;

public class Uzytkownik {

    private int id;
    private String login;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uzytkownik that = (Uzytkownik) o;
        return id == that.id && Objects.equals(login, that.login) && Objects.equals(haslo, that.haslo) && Objects.equals(rodzajUprawnienia, that.rodzajUprawnienia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, haslo, rodzajUprawnienia);
    }

    private String haslo;
    private String rodzajUprawnienia;

    public Uzytkownik(int id, String login, String haslo, String rodzajUprawnienia) {
        this.id = id;
        this.login = login;
        this.haslo = haslo;
        this.rodzajUprawnienia = rodzajUprawnienia;
    }


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getHaslo() {
        return haslo;
    }
    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
    public String getRodzajUprawnienia() {return rodzajUprawnienia;}
    public void setRodzajUprawnienia(String rodzajUprawnienia) {this.rodzajUprawnienia = rodzajUprawnienia;}
}
