package system;

import model.Obywatel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SystemObywateli {

    private List <Obywatel> obywatele;

    public SystemObywateli(){

        this.obywatele=new ArrayList<>();
    }

    public List<Obywatel> getObywatele() {return obywatele;}

    public void dodajObywatela(Obywatel obywatel){
        obywatele.add(obywatel);
    }

    public Obywatel dodajObywatela(int id, String imie, String nazwisko, String pesel, String dataUrodzenia,
                                   String ulica, int nrDomu, String miasto, String kodPocztowy, String stanCywilny,
                                   String wyksztalcenie, String plec, String numerDokumentu, String obywatelstwo,
                                   String statusSluzby, String pozwolenieNaBron){

        Obywatel obywatel = new Obywatel(id, imie, nazwisko, pesel, dataUrodzenia, ulica, nrDomu, miasto, kodPocztowy,
                                stanCywilny, wyksztalcenie, plec, numerDokumentu, obywatelstwo, statusSluzby,
                                pozwolenieNaBron);

        obywatele.add(obywatel);
        return obywatel;
    }

    public Obywatel pobierzObywatela(int id){
        if(id > obywatele.size()) {
            return null;
        }
        return obywatele.get(id);
    }

    public void usunObywatela(int id){
        for(int i=0;i< obywatele.size();i++)
        {
            int poszukiwanyObywatel = obywatele.get(i).getId();
            if(poszukiwanyObywatel == id)
            {
                obywatele.remove(i);
                break;
            }
        }
    }

    public void modyfikujObywatela(int id, String imie, String nazwisko, String dataUrodzenia, String ulica, int nrDomu,
                                   String miasto, String kodPocztowy, String stanCywilny, String wyksztalcenie,
                                   String plec, String numerDokumentu, String obywatelstwo, String statusSluzby,
                                   String pozwolenieNaBron){

        for(int i=0;i< obywatele.size();i++)
        {
            int poszukiwanyObywatel = obywatele.get(i).getId();

            if(poszukiwanyObywatel == id)
            {
                obywatele.get(i).setImie(imie);
                obywatele.get(i).setNazwisko(nazwisko);
                obywatele.get(i).setDataUrodzenia(dataUrodzenia);
                obywatele.get(i).setUlica(ulica);
                obywatele.get(i).setNrDomu(nrDomu);
                obywatele.get(i).setMiasto(miasto);
                obywatele.get(i).setKodPocztowy(kodPocztowy);
                obywatele.get(i).setStanCywilny(stanCywilny);
                obywatele.get(i).setWyksztalcenie(wyksztalcenie);
                obywatele.get(i).setPlec(plec);
                obywatele.get(i).setNumerDokumentu(numerDokumentu);
                obywatele.get(i).setObywatelstwo(obywatelstwo);
                obywatele.get(i).setStatusSluzby(statusSluzby);
                obywatele.get(i).setPozwolenieNaBron(pozwolenieNaBron);
                break;
            }
        }
    }

    public float ileSingli(){
        float procentSingli;
        int liczbaObywateli = obywatele.size();
        int liczbaSingli = 0;
        for (Obywatel obywatel : obywatele) {
            if (obywatel.getStanCywilny().equals("singiel")) {
                liczbaSingli += 1;
            }
        }
        procentSingli = liczbaSingli * 100 / liczbaObywateli;
        System.out.println("Procent singli wynosi " + procentSingli + " spośród " + liczbaObywateli + "obywateli" );
        return procentSingli;
    }

    public float ilePlec() {
        float procentKobiet, procentMezczyzn;
        int liczbaKobiet = 0;
        int liczbaMezczyzn = 0;
        int liczbaObywateli = obywatele.size();
        for (Obywatel obywatel : obywatele){
            if(obywatel.getPlec().equals("kobieta")){
                liczbaKobiet += 1;
            }
            else{
                liczbaMezczyzn += 1;
            }
        }
        procentMezczyzn = liczbaMezczyzn * 100 / liczbaObywateli;
        procentKobiet = liczbaKobiet * 100 / liczbaObywateli;
        System.out.println("Procent mężczyzn wynosi " + procentMezczyzn + " spośród " + liczbaObywateli + "obywateli");
        System.out.println("Procent kobiet wynosi " + procentKobiet + " spośród " + liczbaObywateli + "obywateli");
        return procentKobiet;
    }

    public float ileurodzonych(int rok) {
        float procentUrodzen;
        int liczbaUrodzen = 0;
        int liczbaObywateli = obywatele.size();
        for (Obywatel obywatel : obywatele){
            LocalDate rokUrodzenia = LocalDate.parse(obywatel.getDataUrodzenia());
            if (rokUrodzenia.getYear() == rok){
                liczbaUrodzen += 1;
            }
        }
        procentUrodzen = liczbaUrodzen * 100 / liczbaObywateli;
        System.out.println("Procent urodzonych w " + rok + " wynosi " + procentUrodzen + " spośród " + liczbaObywateli + "obywateli");
        return procentUrodzen;
    }

    public float mieszkancyMiasta(String miasto) {
        float procentMieszkancow;
        float liczbaMieszkancow = 0;
        int liczbaObywateli = obywatele.size();
        for (Obywatel obywatel : obywatele) {
            if (obywatel.getMiasto().equals(miasto)){
                liczbaMieszkancow += 1;
            }
        }
        procentMieszkancow = liczbaMieszkancow * 100 / liczbaObywateli;
        System.out.println("Procent mieszkańców mista " + miasto + " wynosi " + procentMieszkancow + " spośród " + liczbaObywateli + "obywateli");
        return procentMieszkancow;
    }

    public float ileWyksztalcenie(String wyksztalcenie){
        float procentWyksztalconych;
        float liczbaWyksztalconych = 0;
        int liczbaObywateli = obywatele.size();
        for (Obywatel obywatel : obywatele) {
            if (obywatel.getWyksztalcenie().equals(wyksztalcenie)){
                liczbaWyksztalconych += 1;
            }
        }
        procentWyksztalconych = liczbaWyksztalconych * 100 / liczbaObywateli;
        System.out.println("Procent obywateli o wykształceniu " + wyksztalcenie + " wynosi " + procentWyksztalconych + " spośród " + liczbaObywateli + "obywateli");
        return procentWyksztalconych;
    }

    public float statystykiWojsko(String sluzba){
        float procentWojsko;
        float liczbaWojsko = 0;
        int liczbaObywateli = obywatele.size();
        for (Obywatel obywatel : obywatele) {
            if (obywatel.getStstusSluzby().equals(sluzba)){
                liczbaWojsko += 1;
            }
        }
        procentWojsko = liczbaWojsko * 100 / liczbaObywateli;
        System.out.println("Procent obywateli, którzy odbyli służbę wojskową wynosi " + procentWojsko + " spośród " + liczbaObywateli + "obywateli");
        return procentWojsko;
    }

    public float ilePozwolenNaBron(String czyBron) {
        float procentPozwolen;
        float liczbaPozwolen = 0;
        int liczbaObywateli = obywatele.size();
        for (Obywatel obywatel : obywatele) {
            if (obywatel.getPozwolenieNaBron().equals(czyBron)){
                liczbaPozwolen += 1;
            }
        }
        procentPozwolen = liczbaPozwolen * 100 / liczbaObywateli;
        System.out.println("Procent obywateli, podiadających pozwolenie na broń wynosi " + procentPozwolen + " spośród " + liczbaObywateli + "obywateli");
        return procentPozwolen;
    }
}
