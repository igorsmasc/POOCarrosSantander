package carros;

public class CaminhaoEletrico extends Caminhao implements ModuloEletrico{
    public CaminhaoEletrico(
            String modelo,
            Integer ano,
            ModuloEletrico moduloEletrico
    ) {
        super(modelo, ano);
    }

    @Override
    public void ativarModoEco() {

    }

    @Override
    public void carregar(int voltagem) {

    }
}
