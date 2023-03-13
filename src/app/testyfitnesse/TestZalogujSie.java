package testyfitnesse;
import fit.ColumnFixture;

public class TestZalogujSie extends ColumnFixture{
    String login;
    String haslo;

    public int oczekiwanyStatus (){
        return SetUp.systemEwidencjiLudnosci.zalogujSie(login,haslo);
    }

}
