package carros;

public class Moto extends Veiculo {
    public Moto(String modelo, Integer ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("carros.Moto acelerando");
    }

    @Override
    public void frear(int velocidade) {
        System.out.println("carros.Moto freando!");
    }

}
