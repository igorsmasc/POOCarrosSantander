public class CaminhaoEletrico extends Caminhao {
    private ModuloEletrico moduloEletrico;

    public CaminhaoEletrico(
            String modelo,
            Integer ano,
            ModuloEletrico moduloEletrico
    ) {
        super(modelo, ano);
        this.moduloEletrico = moduloEletrico;
    }

    public void carregar(int voltagem) {
        this.moduloEletrico.carregar(voltagem);
    }

    public ModuloEletrico getModuloEletrico() {
        return moduloEletrico;
    }

    public void setModuloEletrico(ModuloEletrico moduloEletrico) {
        this.moduloEletrico = moduloEletrico;
    }
}
