package espresso.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.old.leopards.restaurant.MainActivity;

import org.junit.Rule;
import org.junit.Test;

import espresso.fragments.ProfileFragment;

public class GoToProfileTest extends BaseTest {

    //Кликаем на иконку профиля и проверяем открытие нужного фрагмента
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
