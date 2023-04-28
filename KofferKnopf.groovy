public class KofferKnopf implements Observer {

    private RPTaster taster;
    private boolean pressed;

    public KofferKnopf(pin) {
        this.taster = new RPTaster(pin);
        this.pressed = false;
    }
    
    public void setPressed(boolean pressed) { this.pressed = pressed; }
    public boolean isPressed() { return pressed; }
    public boolean istGedrueckt() { return taster.istGedrueckt(); }
}