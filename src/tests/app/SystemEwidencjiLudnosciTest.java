package app;

import model.Obywatel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import system.SystemEwidencjiLudnosci;
import system.SystemObywateli;
import system.SystemUzytkownikow;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.spy;

@Category({TestControl.class, TestEntity.class})
@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemEwidencjiLudnosciTest {
    Dane dane;
    SystemUzytkownikow testSystemUzytkownikow = new SystemUzytkownikow();
    List<Obywatel> testowiObywatele = List.of(new Obywatel(1, "julia", "gosciniak",
            "121212", "2001-02-12", "Legnicka", 2, "Wroclaw",
            "63-900", "singiel", "średnie", "kobieta",
            "3232", "polskie", "nie", "nie"));

    SystemObywateli testowySystemObywateli;
    SystemEwidencjiLudnosci testowySystemEwidencji;



    @Before
    public void setUp() {
        dane = new Dane();

        testSystemUzytkownikow.dodajUzytkownika(1, "login1", "haslo1", "pracownik");
        testSystemUzytkownikow.dodajUzytkownika(2, "login2", "haslo2", "pracownik");
        testowySystemObywateli = new SystemObywateli();
        testowySystemObywateli.dodajObywatela(1, "julia", "gosciniak",
                "121212", "2001-02-12", "Legnicka", 2, "Wroclaw",
                "63-900", "singiel", "średnie", "kobieta",
                "3232", "polskie", "nie", "nie");
        testowySystemObywateli.dodajObywatela(2, "julia", "gosciniak",
                "121212", "2001-02-12", "Legnicka", 2, "Wroclaw",
                "63-900", "singiel", "średnie", "kobieta",
                "3232", "polskie", "nie", "nie");

        testowySystemEwidencji = new SystemEwidencjiLudnosci(testSystemUzytkownikow, testowySystemObywateli);
    }

    @Parameterized.Parameter
    public int number;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data1 = new Object[][]{{0}, {1}};
        return Arrays.asList(data1);
    }


    @Test
    public void testPobierzObywatela() {
        var wynik = testowySystemEwidencji.pobierzDaneOsobiste(number);
        Assert.assertTrue(wynik.equals(dane.testowiObywatele[number]));

    }

    @Test
    public void testZalogujSie(){
      var wynik = testowySystemEwidencji.zalogujSie(dane.daneUzytkownikaLogin[number], dane.daneUzytkownikaHaslo[number]);
      Assert.assertEquals(dane.testStatus[0],wynik);
    }

    @Test
    public void testZalogujSieMock(){
        var systemSpy = spy(testSystemUzytkownikow);
        var wynik = testowySystemEwidencji.zalogujSie(dane.daneUzytkownikaLogin[number], dane.daneUzytkownikaHaslo[number]);
        Mockito.verify(systemSpy, Mockito.atMost(1)).sprawdzDaneLogowania(anyString(), anyString());
    }


}

