package main.java.exercises.radio;

public class Main {

    public static void main(String[] args) {

        Radio radio1 = new Radio("Sony");
        radio1.setOn(true);
        radio1.setVolume(3);
        System.out.println("The first radio: " + radio1);

        Radio radio2 = new Radio("Acer");
        radio2.setOn(false);
        radio2.setVolume(120);
        System.out.println("The second radio: " + radio2);

        Radio radio3 = new Radio("Samsung");
        System.out.println("The third radio: " + radio3);


    }
}
