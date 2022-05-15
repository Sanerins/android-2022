package espresso.fragments;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import com.old.leopards.restaurant.R;

public class CartFragment {

    private static final int ICON_ID = R.id.navigation_cart;
    private static final int TEXT_ID = R.id.text_cart;

    public CartFragment open() {
        onView(withId(ICON_ID))
                .check(matches(isDisplayed()))
                .perform(click());
        return this;
    }

    public CartFragment checkOpened() {
        onView(withId(TEXT_ID))
                .check(matches(isDisplayed()));
        return this;
    }

}
