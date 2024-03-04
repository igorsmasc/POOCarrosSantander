package bd;

import carros.Carro;

public interface BancoDeDadosCarro {
    void salvar(Carro carro);
    Carro buscar(String id);
}
