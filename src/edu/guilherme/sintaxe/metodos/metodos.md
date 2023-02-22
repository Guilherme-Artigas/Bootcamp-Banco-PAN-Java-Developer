# Métodos

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.

### Critério de nomeação de Métodos

Esses critérios não são obrigatórios, mas é recomendável serem seguidos, pois, essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

- Deve ser nomeado como verbo
- Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

Abaixo temos um exemplo de uma classe com dois métodos e suas respectivas considerações:

```java
public class MyClass {
	
public double somar(int num1, int num2){
  //LOGICA - FINALIDADE DO MÉTODO
  return;
}

public void imprimir(String texto){
  //LOGICA - FINALIDADE DO MÉTODO
  //AQUI NÃO PRECISA DO RETURN
  //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
}

// throws Exception: indica que o método ao ser utilizado
// poderá gerar uma exceção
public double dividir(int dividendo, int divisor) throws Exception{}

// este método não pode ser visto por outras classes no projeto
private void metodoPrivado(){}

//alguns equívocos estruturais
public void validar(){
  //este método deveria retornar algum valor
  //no caso boolean (true ou false)
}

public void calcularEnviar(){
  //um método deve representar uma única responsabilidade
}

public void gravarCliente(String nome, String cpf, Integer telefone){
  //este método tem a finalidade de gravar
  //informações de um cliente, por que não criar
  //um objeto cliente e passar como parâmetro?
  //veja abaixo
}

public void gravarCliente(Cliente cliente){}
  //ou
public void gravar(Cliente cliente){}
}
```