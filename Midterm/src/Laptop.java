public class Laptop extends Device {
    private boolean ssd;

    public Laptop(String cpu, int ram, boolean ssd) {
        super(cpu, ram);
        this.ssd = ssd;
    }

    public Laptop(String model, int price, int count, int sold, String cpu, int ram, boolean ssd) {
        super(model, price, count, sold, cpu, ram);
        this.ssd = ssd;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    @Override
    void showDetails() {
        System.out.println("LAPTOP: "+getModel()+" "+getPrice()+" "+getCpu()+" "+getRam()+" "+"SSD is "+ssd +" " +"performance:" + getPerformance());
    }

    @Override
    double getPerformance() {
        int power = 0;
        if (getCpu() == "corei3") power += 3000;
        else if (getCpu() == "corei5") power += 5000;
        else if (getCpu() == "corei7") power += 7000;
        if(getRam()>=4)power+=1000;
        else power+=500;
        if (isSsd()==true)power+=1000;
        return power;
    }
}

