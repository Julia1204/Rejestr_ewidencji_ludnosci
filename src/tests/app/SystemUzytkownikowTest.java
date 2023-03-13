package app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import system.SystemUzytkownikow;
import java.util.Arrays;
import java.util.Collection;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Category({TestControl.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class SystemUzytkownikowTest {
    Dane dane;
    SystemUzytkownikow testSystemUzytkownikow = new SystemUzytkownikow();


    @Before
    public void setUp() {
        dane = new Dane();
        testSystemUzytkownikow.dodajUzytkownika(1, "login1", "haslo1", "pracownik");
        testSystemUzytkownikow.dodajUzytkownika(2, "login2", "haslo2", "pracownik");
    }

    @Parameterized.Parameter
    public int number;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data1 = new Object[][]{{0}, {1}};
        return Arrays.asList(data1);
    }

    @Test
    public void testZalogujSie() {
        int wynik = testSystemUzytkownikow.sprawdzDaneLogowania(dane.daneUzytkownikaLogin[number],
                dane.daneUzytkownikaHaslo[number]);

        Assert.assertEquals(dane.testStatus[0], wynik);


    }

    @Test
    public void testZalogujSieMock() {
        var systemMock = mock(SystemUzytkownikow.class);
        when(systemMock.sprawdzDaneLogowania(anyString(), anyString())).thenReturn(1);
        Assert.assertEquals(1, systemMock.sprawdzDaneLogowania(dane.daneUzytkownikaLogin[number], dane.daneUzytkownikaHaslo[number]));
    }

    @Test
    public void testPobierzUzytkownika(){
        var wynik = testSystemUzytkownikow.pobierzUzytkownika(number);
        Assert.assertTrue(dane.testowiUzytkownicy[number].equals(wynik));

    }

}
