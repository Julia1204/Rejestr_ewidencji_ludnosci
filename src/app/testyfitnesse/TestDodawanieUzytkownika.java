package testyfitnesse;
import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;
public class TestDodawanieUzytkownika extends ColumnFixture{
    int id;
    String dane[];
    public boolean dodajUzytkownika() throws IllegalFormatCodePointException {
        int s1=liczbaUzytkownikow();
        try{
            SetUp.systemEwidencjiLudnosci.zarzadzajUzytkownikiem(id,dane);
            int s2=liczbaUzytkownikow();
            return s1!=s2;
        }
        catch(IllegalFormatCodePointException e) {
        }
            return false;
        }
        public int liczbaUzytkownikow() {
            return SetUp.systemEwidencjiLudnosci.getSystemUzytkownikow().getUzytkownicy().size();
        }
}
