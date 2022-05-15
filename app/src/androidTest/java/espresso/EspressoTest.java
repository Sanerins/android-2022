package espresso;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.old.leopards.restaurant.MainActivity;
import com.old.leopards.restaurant.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void goToShoppingCartTest() {
        onView(withId(R.id.navigation_cart))
                .check(matches(isDisplayed()))
                .perform(click());
        onView(withId(R.id.text_cart))
                .check(matches(isDisplayed()));
    }

    @Test
    public void goToMenuTest() {
        onView(withId(R.id.navigation_food))
                .check(matches(isDisplayed()))
                .perform(click());
        onView(withId(R.id.text_food))
                .check(matches(isDisplayed()));
    }

    @Test
    public void goToProfileTest() {
        onView(withId(R.id.navigation_profile))
                .check(matches(isDisplayed()))
                .perform(click());
        onView(withId(R.id.text_profile))
                .check(matches(isDisplayed()));
    }
}
