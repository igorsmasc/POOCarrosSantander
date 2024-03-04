package carros;

public class Caminhao extends Veiculo implements SistemaDeTransporte {

    public Caminhao(String modelo, Integer ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando caminhao");
    }

    @Override
    public void frear(int velocidade) {
        System.out.println("Freando caminhao");
    }

    @Override
    public void controleDeCarga(double peso, int distancia) {

    }

    @Override
    public void calcularRota(String[] pontosDeEntrega) {

    }
}
