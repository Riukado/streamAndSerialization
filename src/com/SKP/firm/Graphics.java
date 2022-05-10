package com.SKP.firm;

import java.io.Serializable;

public class Graphics implements Serializable {
    private String type;
    private String cardName;

    Graphics(){
    }

    public Graphics(String type, String cardName) {
        this.type = type;
        this.cardName = cardName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", cardName='" + cardName + '\'' +
                '}';
    }
}
