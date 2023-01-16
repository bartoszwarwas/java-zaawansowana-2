package oop.task1;

public class MobilePhone extends MobileDevice{
    boolean lteSupport;
    public String showDeviceInfo (){
        return "Mobile Device{" +
                "screenSize=" + screenSize +
                ", memoryRam=" + memoryRam +
                ", cpu=" + cpu +
                ", operationSystem=" + operationSystem +
                ", deviceType=" + deviceType +
                ", lteSupport=" +lteSupport +
                '}';

    }
}
