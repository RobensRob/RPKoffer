public class KofferTastenfeld {
    
    def tastenfeld;
    
    public KofferTastenfeld(pin1, pin2, pin3, pin4, pin5, pin6, pin7, pin8) {
        this.tastenfeld = new RPTastenfeld();
        tastenfeld.setPins(pin1, pin2, pin3, pin4, pin5, pin6, pin7, pin8)
    }
    
    
    
}