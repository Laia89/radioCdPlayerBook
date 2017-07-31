package main.java.exercises.radio;

public class Radio {

    //1- Cread una clase Radio con propiedades brand, volume y on (encendida o no).
    // Pensad constructor, getters, setters y demás métodos que creáis interesante poner.

    //Propiedades
    private String brand;
    private int volume;
    private boolean on;

    //Constructor
    public Radio (String brand) {
        this.brand = brand;
        this.volume = 0;
        this.on = false;
    }

    //getters & setters

    public String getBrand() {return this.brand;}

    public int getVolume() {return this.volume;}

    public boolean getOn() {return this.on;}

    public void setVolume(int volume) {
        int maxVolume = 100;
        if (volume >= maxVolume) {
            this.volume = maxVolume;
        } else if (volume <= 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    public void setOn (boolean on) {
        if (on) {
            this.on = on;
        } else {
            this.on = false;
        }
    }

    //implement toString() to get a description of the radio
    public String toString() {
        String switchState = this.on? "on" : "off";
        return this.brand + " is turned " + switchState + " at volume " + this.volume;
    }

}
