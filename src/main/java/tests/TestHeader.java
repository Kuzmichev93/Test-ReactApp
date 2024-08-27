package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import page.index.ui.Header;

public class TestHeader extends Header {
    /* Данный класс используется, для получения ожидаемого результата тест кейса */
    @Test
    public void testSearch() {
        /* Выполняемые действия: Ввести в поле search любое значение.
        Ожидаемый результат: Поле search отобразит введенное значение*/

        String str = "Hello";
        String response = getTextSearch(str);
        Assertions.assertEquals(str,response);
    }

    @Test
    public void testCloseButtonNotActive1(){
        /*Выполняемые действия: Окрыть главную страницу.
        Ожидаемый результат: Кнопка close в поле search будет скрыта*/

        boolean response = getCloseButtonNotActive1();
        Assertions.assertFalse(response);

    }
    @Test
    public void testCloseButtonNotActive2(){
        /*Выполняемые действия: 1)Окрыть главную страницу, 2)Кликнуть на поле search.
        Ожидаемый результат: Кнопка close в поле search будет скрыта*/
        boolean response = getCloseButtonNotActive2();
        Assertions.assertFalse(response);
    }

    @Test
    public void testCloseButtonActive(){
        /*Выполняемые действия: 1)Окрыть главную страницу, 2)Кликнуть на поле search, 3)Ввести данные в поле search.
        Ожидаемый результат: Кнопка close в поле search будет НЕ скрыта*/
        boolean response = getCloseButtonActive();
        Assertions.assertTrue(response);
    }

    @Test
    public void testCloseButtonNotActive3() {
        /*Выполняемые действия: 1)Окрыть главную страницу, 2)Кликнуть на поле search,
        3)Ввести данные в поле search, 4) Стереть данные из поля search
        Ожидаемый результат: Кнопка close в поле search будет скрыта*/

        boolean response = getCloseButtonNotActive3();
        Assertions.assertFalse(response);
    }
}
