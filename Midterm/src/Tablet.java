public class Tablet extends Device{
    private String resolution;

    public Tablet(String cpu, int ram, String resolution) {
        super(cpu, ram);
        this.resolution = resolution;
    }

    public Tablet(String model, int price, int count, int sold, String cpu, int ram, String resolution) {
        super(model, price, count, sold, cpu, ram);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    double getPerformance() {
        int power=0;
        if (getCpu()=="qualcom600")power+=600;
        else if(getCpu()=="qualcom700")power+=700;
        if(getRam()>=4)power+=1000;
        else power+=500;
        return power;
    }

    @Override
    void showDetails() {
        System.out.println("TABLET: "+getModel()+" "+getPrice()+" "+getCpu()+" "+getRam()+" "+resolution+" "+ "performance:" + getPerformance());
    }
}
