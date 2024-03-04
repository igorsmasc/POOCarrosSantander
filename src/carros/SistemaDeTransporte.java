package carros;

public interface SistemaDeTransporte {
    void controleDeCarga(double peso, int distancia);
    void calcularRota(String[] pontosDeEntrega);
}
