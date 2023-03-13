package model;

public class Fabryka {

    public static Obywatel createObywatel(int id, String imie, String nazwisko, String pesel, String dataUrodzenia, String ulica, int nrDomu,
                                          String miasto, String kodPocztowy, String stanCywilny, String wyksztalcenie, String plec,
                                          String numerDokumentu, String obywatelstwo, String ststusSluzby, String pozwolenieNaBron) throws InvalidItemDataException{

        if(imie == null) {
            throw new InvalidItemDataException();
        }
        return new Obywatel(id,  imie,  nazwisko,  pesel,  dataUrodzenia,  ulica,  nrDomu,
         miasto,  kodPocztowy,  stanCywilny,  wyksztalcenie,  plec,
                 numerDokumentu,  obywatelstwo,  ststusSluzby,  pozwolenieNaBron);
    }


}
