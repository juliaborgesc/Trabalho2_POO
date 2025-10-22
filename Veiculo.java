public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFab;
    protected int mesFab;
    protected int anoMod;
    protected double valor;

    public Veiculo(String marca, String modelo, int anoFab, int mesFab, int anoMod, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.mesFab = mesFab;
        this.anoMod = anoMod;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    public int getAutonomia() {
        return 0;
    }

    public String toString() {
        return marca + " " + modelo + " " + anoFab + "/" + anoMod + " - Autonomia: " + getAutonomia() + "km";
    }

}