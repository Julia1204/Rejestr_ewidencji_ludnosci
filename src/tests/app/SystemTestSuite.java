package app;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({SystemEwidencjiLudnosciTest.class, SystemUzytkownikowTest.class, SystemObywateliTest.class})
@RunWith(Categories.class)
@Categories.IncludeCategory(TestControl.class)
public class SystemTestSuite {

}
