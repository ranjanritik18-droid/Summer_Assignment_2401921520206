//Playable.java
package music;
public interface Playable {
    void play();
}
//Veena.java
package music.string;

import music.Playable;

public class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Veena (String Instrument)");
    }
}
//Saxophone.java
package music.wind;
import music.Playable;

public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Saxophone (Wind Instrument)");
    }
}
//Test.java
package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        
        System.out.println("--- Section A: Testing Veena Instance ---");
        Veena myVeena = new Veena();
        myVeena.play();

        System.out.println("\n--- Section B: Testing Saxophone Instance ---");
        Saxophone mySaxophone = new Saxophone();
        mySaxophone.play();

        System.out.println("\n--- Section C: Testing Interface Reference (Polymorphism) ---");
        
        Playable playableInstrument; 
        
        playableInstrument = myVeena;
        playableInstrument.play();
      
        playableInstrument = mySaxophone;
        playableInstrument.play();
    }
}
