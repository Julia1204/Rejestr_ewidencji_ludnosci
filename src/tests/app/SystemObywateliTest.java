package app;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;
import model.Obywatel;
import system.SystemObywateli;

import static org.mockito.Mockito.*;

@Category({TestControl.class, TestEntity.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemObywateliTest {

    Obywatel testowyObywatel = new Obywatel(1, "julia", "gosciniak",
            "121212", "2001-02-12", "Legnicka", 2, "Wroclaw",
            "63-900", "singiel", "średnie", "kobieta",
            "3232", "polskie", "nie", "nie");
    SystemObywateli systemObywateli = new SystemObywateli();

    @Before
    public void setUp(){
        systemObywateli.dodajObywatela(testowyObywatel);
    }

    @Test
    public void testIleSingli(){
        var systemSpy = spy(testowyObywatel);
        systemObywateli.ileSingli();
        Mockito.verify(systemSpy, atMost(1)).getStanCywilny();


    }
}
