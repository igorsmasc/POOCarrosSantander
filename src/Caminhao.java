public class Caminhao extends Veiculo {
    private SistemaDeTransporte sistemaDeTransporte;

    public Caminhao(String modelo, Integer ano, SistemaDeTransporte sistemaDeTransporte) {
        super(modelo, ano);
        this.sistemaDeTransporte = sistemaDeTransporte;
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando caminhao");
    }

    @Override
    public void frear(int velocidade) {
        System.out.println("Freando caminhao");
    }
}
