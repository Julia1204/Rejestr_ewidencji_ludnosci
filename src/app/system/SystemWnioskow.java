package system;

import model.Wniosek;

import java.util.ArrayList;
import java.util.List;

public class SystemWnioskow {

    private List<Wniosek> wnioski;

    public SystemWnioskow(){
        this.wnioski = new ArrayList<>();
    }

    public Wniosek dodajWniosekDodanieDanych(int id, String dane){
        Wniosek wniosek = new Wniosek(id, Wniosek.RodzajWniosku.DODANIE, "zlozony", dane);
        wnioski.add(wniosek);
        return wniosek;
    }

    public Wniosek dodajWniosekUsuniecieDanych(int id, String dane){
        Wniosek wniosek = new Wniosek(id, Wniosek.RodzajWniosku.USUNIECIE, "zlozony", dane);
        wnioski.add(wniosek);
        return wniosek;

    }

    public Wniosek dodajWniosekModyfikacjaDanych(int id, String dane){
        Wniosek wniosek = new Wniosek(id, Wniosek.RodzajWniosku.MODYFIKACJA, "zlozony", dane);
        wnioski.add(wniosek);
        return wniosek;
    }

    public void usunWniosek(int id){
        wnioski.remove(id);
    }

    public int pobierzOstatniIndeks(){
        int size = wnioski.size();
        if (this.wnioski.size()==0){
            return size;
        }
        else
            return size-1;
    }

//    public Wniosek pobierzWniosek(){return null;}
//
//    public boolean czyWniosek (){return true;}
//
//    public void zrealizujWniosek(){}


}
