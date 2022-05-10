package com.SKP.firm;

import java.io.Serializable;

public class Computer implements Serializable {
    public String brand;
    public String model;
    public Processor processor;
    public Graphics graphics;
    public User user;

    Computer(){
    }

    public Computer(String brand, String model, Processor processor, Graphics graphics, User user) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.graphics = graphics;
        this.user = user;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processor=" + processor +
                ", graphics=" + graphics +
                ", user=" + user +
                '}';
    }
}
