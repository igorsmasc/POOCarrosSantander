public class MiniVan extends VeiculoDeTransporte{
    public MiniVan(String modelo, Integer ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando mini van");
    }

    @Override
    public void frear(int velocidade) {
        System.out.println("Freando mini van");
    }

    @Override
    public void controleDeCarga(double peso, int distancia) {

    }

    @Override
    public void calcularRota(String[] pontosDeEntrega) {

    }
}
