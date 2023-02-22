public class SmartTv {
  boolean ligada = false;
  int canal = 0;
  int volume = 25;

  public void ligarTv () {
    System.out.println("Ligando Tv...");
    ligada = true;
  }

  public void desligarTv () {
    System.out.println("Desligando Tv...");
    ligada = false;
  }

  public void aumentarVolume () {
    System.out.println("Aumentando volume de " + volume + " para " + ++volume);
  }

  public void diminuirVolume () {
    System.out.println("Diminuindo volume de " + volume + " para " + --volume);
  }
}
