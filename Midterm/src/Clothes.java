abstract class Clothes extends Good{
    private String size;
    private String color;
    private boolean isKid;
    private boolean isMan;

    public Clothes(String size, String color, boolean isKid, boolean isMan) {
        this.size = size;
        this.color = color;
        this.isKid = isKid;
        this.isMan = isMan;
    }

    public Clothes(String model, int price, int count, int sold, String size, String color, boolean isKid, boolean isMan) {
        super(model, price, count, sold);
        this.size = size;
        this.color = color;
        this.isKid = isKid;
        this.isMan = isMan;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isKid() {
        return isKid;
    }

    public void setKid(boolean kid) {
        isKid = kid;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }
}
