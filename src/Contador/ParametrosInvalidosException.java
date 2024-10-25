package Contador;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); // Chamando o construtor da classe Exception
    }
}
