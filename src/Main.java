public class Main {
  public static void main(String[] args) {
    SmartTv LG = new SmartTv();
    LG.ligarTv();
    System.out.println("A Tv está ligada? " + (LG.ligada ? "Sim" : "Não"));
    LG.desligarTv();
    System.out.println("A Tv está ligada? " + (LG.ligada ? "Sim" : "Não"));
    System.out.println("--------------------------");
    System.out.println("Volume atual da Tv: " + LG.volume);
    LG.aumentarVolume();
    LG.aumentarVolume();
    LG.aumentarVolume();
    LG.diminuirVolume();
    LG.diminuirVolume();
  }
}