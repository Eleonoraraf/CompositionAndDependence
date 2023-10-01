public class Poster {
    private int id;//идентификатор
    private int posterId;//идентификатор плаката
    private String posterName;//Название
    private int posterPrice;//Цена
    private int count;//Количество

    public Poster(int id, int posterId,String posterName, int posterPrice, int count) {
        this.id = id;
        this.posterId = posterId;
        this.posterName = posterName;
        this.posterPrice = posterPrice;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public int getPоsterPrice() {
        return posterPrice;
    }

    public int getCount() {
        return count;
    }


}
