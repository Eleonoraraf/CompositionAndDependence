public class PosterRepository {

    private  Poster[] items = new Poster[0];//место куда будут сохраняться изменения.

    public void  save(Poster item) {//Сохранение
        Poster[] tmp = new Poster[items.length+1];// увеличение на одну единицу.
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];//копирование в новый массив всех элементов из старого.
        }
        tmp[tmp.length - 1] = item;//в этом параметре содержится тот элемент который нужно добавить.
        items=tmp;
    }

    public void  removeById(int id) {//Удаление
        Poster[] tmp = new Poster[items.length - 1];//уменьшение на одну единицу
        int copyToIndex = 0;//Переменная куда будем копировать. Изначально она будет ноль.
        for (Poster item : items) {//Ячейка из которой мы копируем.
            if(item.getId() != id) {//Если не равно то мы будем копировать.(Условие наоборот.)
                tmp[copyToIndex] = item;
                copyToIndex++;//Увеличение индекса.
            }
        }
        items=tmp;
    }

    public Poster[] getItems() {//просмотр истории добавлений.
        return items;//Отдать данные.
    }
}
