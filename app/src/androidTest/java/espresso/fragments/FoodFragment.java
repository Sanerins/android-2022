package espresso.fragments;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import com.old.leopards.restaurant.R;

public class FoodFragment {

    private static final int ICON_ID = R.id.navigation_food;
    private static final int TEXT_ID = R.id.text_food;

    public FoodFragment open() {
        onView(withId(ICON_ID))
                .check(matches(isDisplayed()))
                .perform(click());
        return this;
    }

    public FoodFragment checkOpened() {
        onView(withId(TEXT_ID))
                .check(matches(isDisplayed()));
        return this;
    }

}
