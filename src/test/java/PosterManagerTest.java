import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
public class PosterManagerTest {

    PosterRepository repo = Mockito.mock(PosterRepository.class);//данные с реп-ия(заглушка)
    PosterManager manager= new PosterManager(repo);//данные с мен-ра
    Poster item1 = new Poster(11,1,"Роль не по карману",40,3);//данные для тестирования
    Poster item2 = new Poster(222,22,"Трасса2",30,1);//данные для тестирования
    Poster item3 = new Poster(3,30,"Отвергнутая",20,7);//данные для тестирования


    @Test
    public void shouldReverseAllItems() {//Показать все элементы в обратном порядке.
        Poster[] items = {item1, item2, item3};//обращение к заглушке, какие запомнила элементы.
        doReturn(items).when(repo).getItems();//возвращай массив items когда тебя repo попросят выполнить команду getItems.

        Poster[] expected = {item3, item2, item1};
        Poster[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSum() {//сумма покупок.
        Poster[] items = {item1, item2, item3};//обращение к заглушке, какие запомнила элементы.
        doReturn(items).when(repo).getItems();//возвращай массив items когда тебя repo попросят выполнить команду getItems.

        int expected = 290;
        int actual = manager.getTotal();

        Assertions.assertEquals(expected, actual);
    }
}
