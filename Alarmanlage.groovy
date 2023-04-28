hupe = new KofferKnopf();
summer = new KofferSummer();

while(true) {
    if(hupe.istGedrueckt()) {
        summer.alarmiere();
    } else {
        if(!summer.isTriggered()) {
            summer.ausschalten();
        }
    }
}