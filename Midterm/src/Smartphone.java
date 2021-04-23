public class Smartphone extends Device{
    private String generation;

    public Smartphone(String cpu, int ram, String generation) {
        super(cpu, ram);
        this.generation = generation;
    }

    public Smartphone(String model, int price, int count, int sold, String cpu, int ram, String generation) {
        super(model, price, count, sold, cpu, ram);
        this.generation = generation;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    @Override
    double getPerformance() {
        int power=0;
        if (getCpu()=="qualcom600")power+=600;
        else if(getCpu()=="qualcom700")power+=700;
        if(getRam()>=4)power+=1000;
        else power+=500;
        if(getGeneration()=="g1")power+=100;
        else if(getGeneration()=="g2")power+=200;
        else if(getGeneration()=="g3")power+=300;
        return power;
    }

    @Override
    void showDetails() {
        System.out.println("SMARTPHONE: "+getModel()+" "+getPrice()+" "+getCpu()+" "+getRam()+" "+"Generation: "+generation +" " + "performance:" + getPerformance());
    }
}
