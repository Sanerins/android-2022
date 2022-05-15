package espresso.tests;

import org.junit.Test;

import espresso.fragments.FoodFragment;

public class GoToMenuTest extends BaseTest {

    //Кликаем на иконку меню и проверяем открытие нужного фрагмента
    @Test
    public void goToMenuTest() {
        FoodFragment fragment = new FoodFragment();
        fragment.open()
                .checkOpened();
    }
}
