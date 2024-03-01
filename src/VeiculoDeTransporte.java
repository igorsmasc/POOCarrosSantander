public abstract class VeiculoDeTransporte extends Veiculo {
    public VeiculoDeTransporte(String modelo, Integer ano) {
        super(modelo, ano);
    }

    public abstract void controleDeCarga(double peso, int distancia);

    public abstract void calcularRota(String[] pontosDeEntrega);
}
