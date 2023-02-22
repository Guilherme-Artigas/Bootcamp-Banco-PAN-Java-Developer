# Anatomia das classes

A escrita de códigos de um programa é feito através da composição de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome do nossos arquivos, classes, atributos e métodos.

É muito comum mesclarmos expressões no idioma americano com o nosso vocabulário. Existem projetos que recomendam que toda a implementação do seu programa seja escrita na língua inglesa.

### Sintaxe de declaração de uma nova classe:

```java
public class MinhaClass {
  // Corpo da classe
  public static void main (String[] args) {
    // Corpo do método main
  }
}
```

### Identação

Basicamente indentar é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.

Exemplo de indentação errada:

```java
// arquivo BoletimEstudantil.java

public class BoletimEstudantil {
public static void main(String[] args) {
int mediaFinal = 6;
if(mediaFinal<6)	
System.out.println("REPROVADO"); 
else if(mediaFinal==6)
System.out.println("PROVA MINERVA"); 
else
System.out.println("APROVADO"); 		
}
}
```

Exemplo de identação correta:

```java
public class BoletimEstudantil {
  public static void main(String[] args) {
    int mediaFinal = 6;
    if (mediaFinal < 6)
      System.out.println("REPROVADO");
    else if (mediaFinal == 6)
      System.out.println("PROVA MINERVA");
    else
      System.out.println("APROVADO");
  }
}
```
