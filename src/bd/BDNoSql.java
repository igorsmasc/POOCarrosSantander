package bd;

import carros.Carro;

public class BDNoSql implements BancoDeDadosCarro{
    @Override
    public void salvar(Carro carro) {
        // TODA A LOGICA RELACIONADA A TECNOLOGIA DO BANCO DE DADOS
    }

    @Override
    public Carro buscar(String id) {
        // TODA A LOGICA RELACIONADA A TECNOLOGIA DO BANCO DE DADOS
        return null;
    }
}
