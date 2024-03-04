package bd;

import carros.Carro;

public class BDSql implements BancoDeDadosCarro {
    public Carro buscar(String id) {
        // TODA A LOGICA RELACIONADA A TECNOLOGIA DO BANCO DE DADOS
        return new Carro("MODELO", 2020);
    }

    public void salvar(Carro carro) {
        // TODA A LOGICA RELACIONADA A TECNOLOGIA DO BANCO DE DADOS
        System.out.println("salvando");
    }
    // ....
}
