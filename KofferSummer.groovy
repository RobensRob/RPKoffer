public class KofferSummer implements AlarmInterface {
    
    private RPSummer summer;
    
    public KofferSummer(pin) {
        this.summer = new RPSummer(pin);
    }
    
    @Override
    public void alarmiere() {
        if(!summer.istAn()) {
            summer.an();
        }
    }
    
    @Override
    public void isTriggered() {
        return summer.istAn();
    }
    
    public void ausschalten() {
        summer.aus();
    }
}