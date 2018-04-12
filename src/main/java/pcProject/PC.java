package pcProject;

public class PC {

    private Motherboard motherboard;
    private Monitor monitor;
    private Case cases;

    public PC(Motherboard motherboard, Monitor monitor, Case cases){
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.cases = cases;
    }


    private void drawLogo(){
        monitor.showLogo(1304, 666, "Blood Red");
    }

    public void powerUp(){
         cases.pressPowerButton();
         drawLogo();
    }



    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Case getCases() {
        return cases;
    }



    @Override
    public String toString() {
        return "PC{" +
                "motherboard=" + motherboard +
                ", \n monitor=" + monitor +
                ", \n cases=" + cases +
                '}';
    }

}
