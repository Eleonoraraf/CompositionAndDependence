import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {

    Poster item1 = new Poster(11,1,"Роль не по карману",40,3);//данные для тестирования
    Poster item2 = new Poster(222,22,"Трасса2",30,1);//данные для тестирования
    Poster item3 = new Poster(3,30,"Отвергнутая",20,7);//данные для тестирования

    @Test
    public void test() {
        PosterRepository repo = new PosterRepository();
        repo.save(item1);//Сохранение введённых данных для тестирования
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item2.getId());

        Poster[] expected = {item1, item3};//Ожидаемый результат
        Poster[] actual = repo.getItems();//Фактический результат

        Assertions.assertArrayEquals(expected, actual);
    }
}
