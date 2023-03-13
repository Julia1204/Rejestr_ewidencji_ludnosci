package app;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({ObywatelTest.class})
@RunWith(Categories.class)
@Categories.IncludeCategory(TestEntity.class)
public class ModelTestSuite {


}
