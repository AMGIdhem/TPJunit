package ex3;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ex1.FactureTest;
import ex2.PluspcmTest;

@RunWith(Suite.class)
@SuiteClasses({MockitoTest.class, PluspcmTest.class, FactureTest.class})
public class AllTests {

}
