package espresso.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.old.leopards.restaurant.MainActivity;

import org.junit.Rule;
import org.junit.Test;

import espresso.fragments.CartFragment;

public class GoToCartTest extends BaseTest {

    //Кликаем на иконку корзины и проверяем открытие нужного фрагмента
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void goToShoppingCartTest() {
        CartFragment fragment = new CartFragment();
        fragment.open()
                .checkOpened();
    }
}
