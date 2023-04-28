public class KofferSensor implements Observer{

    private Helligkeitssensor hSensor;
    private Controller controller;
    
    public KofferSensor(pin) {
        this.hSensor = new Helligkeitssensor(pin);
    }
    
    public boolean check() {
        return hSensor.befragen();
    }    
    
    public void setController(controller) {
        this.controller = controller;
    }
    public Controller getController() { return controller; }
}