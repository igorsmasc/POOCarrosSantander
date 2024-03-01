public class Carro extends Veiculo {
    // atributos
    // contrutor
    // metodos

    public Carro(String modelo, Integer ano) {
        super(modelo, ano);
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
