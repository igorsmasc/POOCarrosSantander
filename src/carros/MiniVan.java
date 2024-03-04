package carros;

public class MiniVan extends Veiculo{
    private SistemaDeTransporte sistemaDeTransporte;

    public MiniVan(String modelo, Integer ano, SistemaDeTransporte sistemaDeTransporte) {
        super(modelo, ano);
        this.sistemaDeTransporte = sistemaDeTransporte;
    }

    public void controleDeCarga(Double peso, Integer distancia) {
        this.sistemaDeTransporte.controleDeCarga(peso, distancia);
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando mini van");
    }

    @Override
    public void frear(int velocidade) {
        System.out.println("Freando mini van");
    }
}
