public class Caminhao extends VeiculoDeTransporte {
    public Caminhao(String modelo, Integer ano) {
        super(modelo, ano);
    }

    @Override
    public void controleDeCarga(double peso, int distancia) {
        System.out.println("Controlando carga");
    }

    @Override
    public void calcularRota(String[] pontosDeEntrega) {
        System.out.println("Gerando rota");
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
