public class MotoEspecial extends Moto {
    private SistemaDeTransporte sistemaDeTransporte;
    private ModuloEletrico moduloEletrico;

    public MotoEspecial(
            String modelo,
            Integer ano,
            SistemaDeTransporte sistemaDeTransporte,
            ModuloEletrico moduloEletrico) {
        super(modelo, ano);
        this.moduloEletrico = moduloEletrico;
        this.sistemaDeTransporte = sistemaDeTransporte;
    }
}
