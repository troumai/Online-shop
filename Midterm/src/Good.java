abstract class Good {
    private String model;
    private int price;
    private int count;
    private int sold;
    abstract void showDetails();

    public Good() {
    }

    public Good(String model, int price, int count, int sold) {
        this.model = model;
        this.price = price;
        this.count = count;
        this.sold = sold;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}
