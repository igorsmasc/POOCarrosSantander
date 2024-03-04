package administracao;

import bd.BDSql;
import bd.BancoDeDadosCarro;
import carros.Carro;

public class CadastroDeCarros {
    private BancoDeDadosCarro bancoDeDadosCarro;

    public CadastroDeCarros(BancoDeDadosCarro bancoDeDadosCarro) {
        this.bancoDeDadosCarro = bancoDeDadosCarro;
    }

    public void cadastrarCarro(Carro carro) {
        bancoDeDadosCarro.salvar(carro);
    }

    public Carro buscarCarroCadastrado(String id) {
        return bancoDeDadosCarro.buscar(id);
    }
}
