public abstract class Veiculo {
    private String modelo;
    private Integer ano;

    public abstract void acelerar(int velocidade);
    public abstract void frear(int velocidade);

    public final void buzinar() {
        System.out.println("BIIIIIII!");
    }

    public Veiculo(String modelo, Integer ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
