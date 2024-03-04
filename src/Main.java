import administracao.CadastroDeCarros;
import bd.*;
import carros.Carro;

public class Main {
    public static void main(String[] args) {

        BancoDeDadosCarro bancoDeDadosCarro = new GatewayHttp();
        CadastroDeCarros cadastroDeCarros = new CadastroDeCarros(bancoDeDadosCarro);
        Carro carro = new Carro("modelo", 1234);

        cadastroDeCarros.cadastrarCarro(carro);
        cadastroDeCarros.buscarCarroCadastrado("");

    }
}
