public class Hibrido extends Veiculo {
    private double autonomiaComb;
    private double capacidadeComb;
    private double autonomiaBat;
    private double capacidadeBat;
    
    public Hibrido(String marca, String modelo, int anoFab, int mesFab, int anoMod, double valor,
                   double autonomiaComb, double capacidadeComb,
                   double autonomiaBat, double capacidadeBat) {
        super(marca, modelo, anoFab, mesFab, anoMod, valor);
        this.autonomiaComb = autonomiaComb;
        this.capacidadeComb = capacidadeComb;
        this.autonomiaBat = autonomiaBat;
        this.capacidadeBat = capacidadeBat;
    }

    public int getAutonomia() {
        return (int) Math.round(autonomiaComb + autonomiaBat);
    }

    public String toString() {
        return super.toString() + " (Híbrido)";
    }
}