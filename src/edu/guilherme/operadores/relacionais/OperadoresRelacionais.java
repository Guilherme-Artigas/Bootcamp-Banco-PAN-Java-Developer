package edu.guilherme.operadores.relacionais;

public class OperadoresRelacionais {
  public static void main(String[] args) {
    int i1 = 10;
    int i2 = 20;

    float f1 = 4.5F;
    float f2 = 3.5F;

    double d1 = 59.6D;
    double d2 = 99.22D;

    char c1 = 'G';
    char c2 = 'u';

    String st1 = "Guilherme";
    String st2 = "Rafaela";
    String st3 = "Julia";

    boolean bo1 = true;
    boolean bo2 = false;

    long l1 = 1992L;
    long l2 = 2020L;

    byte by1 = 1;

    short sh1 = 31;

    System.out.println("Comparação entre duas variáveis do mesmo tipo - inteiro...");
    System.out.println("i1 == i2 " + (i1 == i2));
    System.out.println("i1 != i2 " + (i1 != i2));
    System.out.println("i1 > i2 " + (i1 > i2));
    System.out.println("i1 < i2 " + (i1 < i2));
    System.out.println("-------------------------------------------------");

    System.out.println("Comparação entre duas variáveis do mesmo tipo - float...");
    System.out.println("f1 == f2 " + (f1 == f2));
    System.out.println("f1 != f2 " + (f1 != f2));
    System.out.println("f1 > f2 " + (f1 > f2));
    System.out.println("f1 < f2 " + (f1 < f2));
    System.out.println("-------------------------------------------------");

    System.out.println("Comparação entre duas variáveis do mesmo tipo - char...");
    System.out.println("c1 == c2 " + (c1 == c2));
    System.out.println("c1 != c2 " + (c1 != c2));
    System.out.println("c1 > c2 " + (c1 > c2));
    System.out.println("c1 < c2 " + (c1 < c2));
    System.out.println("-------------------------------------------------");

    System.out.println("Comparação entre duas variáveis do mesmo tipo - string...");
    System.out.println("st1 == st2 " + (st1 == st2));
    System.out.println("st1 == st3 " + (st1 == st3));
    System.out.println("st1 != st2 " + (st1 != st2));
    // System.out.println("st1 < st2 " + (st1 < st2)); gera um erro!
    System.out.println("-------------------------------------------------");

    System.out.println("Comparação entre duas variáveis do mesmo tipo - boolean...");
    System.out.println("bo1 == bo2 " + (bo1 == bo2));
    System.out.println("bo1 != bo2 " + (bo1 != bo2));
    // System.out.println("bo1 > bo2 " + (bo1 > bo2)); gera um erro!
    System.out.println("-------------------------------------------------");

    System.out.println("Comparação entre variáveis de tipos diferentes - int, float, double e short...");
    System.out.println("i2 > f1 " + (i2 > f1));
    System.out.println("d1 == sh1" + (d1 == sh1));
    // System.out.println("st2 != c1 " + (st2 != c1)); gera um erro!
    // System.out.println("st3 != i1 " + (st3 != i1)); gera um erro!
    System.out.println("-------------------------------------------------");

    System.out.println("Comparação entre variáveis de tipos diferentes, long, int, byte e short...");
    System.out.println("l1 == i2" + (l1 == i2));
    System.out.println("l2 >= i1" + (l2 >= i1));
    System.out.println("by1 != sh1 " + (by1 != sh1));
    System.out.println("-------------------------------------------------");
  }
}
