public class Combustao extends Veiculo {
    private double autonomiaComb;
    private double capacidadeComb;

    public Combustao(String marca, String modelo, int anoFab, int mesFab, int anoMod, double valor,
                     double autonomiaComb, double capacidadeComb) {
        super(marca, modelo, anoFab, mesFab, anoMod, valor);
        this.autonomiaComb = autonomiaComb;
        this.capacidadeComb = capacidadeComb;
    }
    public int getAutonomia() {
        return (int) Math.round(autonomiaComb);
    }

    public String toString() {
        return super.toString() + " (Combustão)";
    }
}