package bd;

import carros.Carro;

public class GatewayHttp implements BancoDeDadosCarro {
    @Override
    public void salvar(Carro carro) {
        // FAZ O POST HTTP
    }

    @Override
    public Carro buscar(String id) {
        // FAZ UM GET HTTP
        return null;
    }
}
