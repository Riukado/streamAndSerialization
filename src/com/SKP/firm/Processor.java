package com.SKP.firm;

import java.io.Serializable;

public class Processor implements Serializable {
    private String clockSpeed;
    private String manufacturer;
    private Integer coreCount;

    Processor(){
    }

    public Processor(String clockSpeed, String manufacturer, Integer coreCount) {
        this.clockSpeed = clockSpeed;
        this.manufacturer = manufacturer;
        this.coreCount = coreCount;
    }

    public String getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(String clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
    }

    @Override
    public String toString() {
        return "{" +
                "clockSpeed='" + clockSpeed + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", coreCount=" + coreCount +
                '}';
    }
}
