public class Sneakers extends Clothes{
    private String season;

    public Sneakers(String size, String color, boolean isKid, boolean isMan, String season) {
        super(size, color, isKid, isMan);
        this.season = season;
    }

    public Sneakers(String model, int price, int count, int sold, String size, String color, boolean isKid, boolean isMan, String season) {
        super(model, price, count, sold, size, color, isKid, isMan);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    void showDetails() {
        System.out.println("SNEAKERS: "+getModel()+" "+getPrice()+" "+getSize()+" "+getColor()+" "+season);
    }
}
