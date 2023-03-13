package testyfitnesse;

import fit.ColumnFixture;

public class TestStatystyka extends ColumnFixture {
    int statystyka, rok;
    //String misato, wyksztalcenie, czyOdbytaSluzba, czyMaPozwolenie;
    float oczekiwanyWynik;

    public boolean sprawdzStatystyke(){
        return SetUp.systemEwidencjiLudnosci.pobierzDane(statystyka) == oczekiwanyWynik;
    }
}
//3