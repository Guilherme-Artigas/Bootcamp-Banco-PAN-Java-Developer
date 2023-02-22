# Tipos de variáveis

Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

No Java utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esta a causa do nome "variável", pois o valor pode variar.

Já as Constantes são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada final, seguida do tipo. Por convenção, Constantes são sempre escritas em CAIXA ALTA.

```java
public class TipoDados {
  public static void main(String[] args) {
    byte idade = 123;
    short ano = 2021;
    int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
    long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
    float pi = 3.14F;
    double salario = 1275.33;
    final String NOME = "Guilherme";
  }
}
```
