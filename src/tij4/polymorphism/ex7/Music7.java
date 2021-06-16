package tij4.polymorphism.ex7;

import tij4.polymorphism.Note;

class Instrument {
    void play(Note n) { System.out.print("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }
    void adjust() { System.out.print("Adjusting Instrument"); }

}

class Wind extends Instrument {
    void play(Note n) { System.out.print("Wind.play() " + n); }

    void adjust() { System.out.print("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { System.out.print("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { System.out.print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { System.out.print("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { System.out.print("Adjusting Stringed"); }
}

class Keyboard extends Instrument {
    void play(Note n) { System.out.print("Keyboard.play() " + n); }
    public String toString() { return "Keyboard"; }
    void adjust() { System.out.print("Adjusting Keyboard"); }
}

class Brass extends Wind {
    void play(Note n) { System.out.print("Brass.play() " + n); }
    public String toString() { return "Brass"; }
    void adjust() { System.out.print("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { System.out.print("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}

class Piano extends Keyboard {
    void play(Note n) { System.out.print("Piano.play() " + n); }
    public String toString() { return "Piano"; }
}

public class Music7 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Piano()
        };
        tuneAll(orchestra);
        for(Instrument i : orchestra)
            System.out.println(i);
    }
}
