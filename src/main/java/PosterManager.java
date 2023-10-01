public class PosterManager {
    private PosterRepository repo;//сохранение данных происходит через репозиторий.

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }

    public  void add(Poster item) {//метод добавления нового элемента и сохранение в репозиторий.
        repo.save(item);
    }

    public Poster[] getItems() {//Показать все элементы в обратном порядке.
        Poster[] all = repo.getItems();//Эл-ты в том порядке в котором добавлялись.
        Poster[] reversed = new  Poster[all.length];//Эл-ты в обратном порядке.
        for (int i= 0; i<reversed.length; i++){
           reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public int getTotal() {//сложение покупок.
        int sum = 0;
        for (Poster item : repo.getItems()) {
            sum= sum + item.getCount() * item.getPоsterPrice();
        }
        return sum;
    }
}
