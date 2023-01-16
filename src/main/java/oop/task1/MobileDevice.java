package oop.task1;

public class MobileDevice {
    public double screenSize;
    public int memoryRam;
    public int cpu;
    public String operationSystem;
    public String deviceType;
    public String showDeviceInfo (){
        return "Mobile Device{" +
                "screenSize=" + screenSize +
                ", memoryRam=" + memoryRam +
                ", cpu=" + cpu +
                ", operationSystem=" + operationSystem +
                ", deviceType=" + deviceType +
                '}';

    }
}
