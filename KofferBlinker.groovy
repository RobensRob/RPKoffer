public class KofferBlinker implements View {
    
    private RPDiode diode;
    
    public KofferBlinker(pin) {
        this.diode = new RPDiode(pin);
    }
    
    @Override
    public void refresh() {
        
    }
    
    @Override
    public void doAction() {
        diode.blinkeEndlosStart();
    }
    
    public void stop() {
        diode.blinkeEndlosStop();
    }
    
}