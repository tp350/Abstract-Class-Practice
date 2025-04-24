public class Main {
  public static void main(String[] args) {

    Instrument violin = new Violin();
    Instrument glockenspiel = new Glockenspiel();

    System.out.println("Tuning the Violin...");
    violin.tune();

    System.out.println("Tuning the Glockenspiel...");
    glockenspiel.tune();

    System.out.println("\nPlaying the Violin...");
    violin.play();

    System.out.println("Playing the Glockenspiel...");
    glockenspiel.play();

    System.out.println();

    violin.done();
    glockenspiel.done();
  }
}
