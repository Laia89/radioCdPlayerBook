package main.java.exercises.cdPlayer;

//Cread la clase Cd con title y duration.
public class Cd {

    //propiedades
    private String title;
    private int duration;

    //constructor
    public Cd(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    //getters
    public String getTitle() {return this.title;}

    public int getDuration() {return this.duration;}

    //toString() method
    public String toString() {return "Cd " + this.title + " of " + this.duration + " seconds duration.";}
}
