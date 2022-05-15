package espresso.tests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.old.leopards.restaurant.MainActivity;
import com.old.leopards.restaurant.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import espresso.fragments.CartFragment;
import espresso.fragments.ProfileFragment;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class GoToProfileTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void goToProfileTest() {
        ProfileFragment fragment = new ProfileFragment();
        fragment.open()
                .checkOpened();
    }
}
