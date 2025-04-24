public abstract class Instrument {

  //method will "play" so it should do something in your code
  public abstract void play();

  //method will "tune" so it should do something in your code that is different from tune
  public abstract void tune();

  public void done()
  {
    System.out.print(this + " has been tuned and played!");
  }
  public String toString() {
    return getClass().getSimpleName();
  }
}
