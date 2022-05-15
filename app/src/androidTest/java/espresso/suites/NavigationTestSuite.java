package espresso.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import espresso.tests.GoToCartTest;
import espresso.tests.GoToMenuTest;
import espresso.tests.GoToProfileTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                GoToCartTest.class,
                GoToMenuTest.class,
                GoToProfileTest.class
        })
public class NavigationTestSuite {
}
