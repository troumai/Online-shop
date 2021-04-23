abstract class Device extends Good{
    private String cpu;
    private int ram;
    abstract double getPerformance();

    public Device(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public Device(String model, int price, int count, int sold, String cpu, int ram) {
        super(model, price, count, sold);
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
