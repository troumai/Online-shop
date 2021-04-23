public class T_shirt extends Clothes{
    private String material;

    public T_shirt(String size, String color, boolean isKid, boolean isMan, String material) {
        super(size, color, isKid, isMan);
        this.material = material;
    }

    public T_shirt(String model, int price, int count, int sold, String size, String color, boolean isKid, boolean isMan, String material) {
        super(model, price, count, sold, size, color, isKid, isMan);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    void showDetails() {
        System.out.println("T-SHIRT: "+getModel()+" "+getPrice()+" "+getSize()+" "+getColor()+" "+material);
    }
}
