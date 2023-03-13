package app;

import model.Obywatel;
import model.Fabryka;
import model.InvalidItemDataException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

@Category({TestEntity.class})
public class ObywatelTest {

    Dane dane;
@Before
public void setUp(){
    dane = new Dane();
}

@Rule
public ExpectedException exception = ExpectedException.none();

@Test
    public void equalsObywatelTest(){
    Obywatel nowyObywatel = new Obywatel(1, "julia", "gosciniak",
            "121212", "2001-02-12", "Legnicka", 2, "Wroclaw",
            "63-900", "singiel", "średnie", "kobieta",
            "3232", "polskie", "nie", "nie");

    Assert.assertTrue(nowyObywatel.equals(dane.testowiObywatele[0]));

}
@Test
public void fabrykaTest(){
    exception.expect(InvalidItemDataException.class);
    exception.expectMessage("Invalid data");

    Fabryka.createObywatel(1, null, "gosciniak",
            "121212", "2001-02-12", "Legnicka", 2, "Wroclaw",
            "63-900", "singiel", "średnie", "kobieta",
            "3232", "polskie", "nie", "nie");
    }

}
