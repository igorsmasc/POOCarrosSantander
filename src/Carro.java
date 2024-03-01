public class Carro extends Veiculo {
    // atributos
    private SistemaDeTransporte sistemaDeTransporte;

    // contrutor
    // metodos

    public Carro(String modelo, Integer ano, SistemaDeTransporte sistemaDeTransporte) {
        super(modelo, ano);
        this.sistemaDeTransporte = sistemaDeTransporte;
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frear(int velocidade) { // freIo
        System.out.println("Carro freando");
    }
}
