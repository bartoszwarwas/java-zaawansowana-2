package oop.task1;

public class Tablet extends MobileDevice{
    public boolean pencilSupport;
    public String showDeviceInfo (){
        return "Mobile Device{" +
                "screenSize=" + screenSize +
                ", memoryRam=" + memoryRam +
                ", cpu=" + cpu +
                ", operationSystem=" + operationSystem +
                ", deviceType=" + deviceType +
                ", pencilSupport=" + pencilSupport +
                '}';

    }
}

