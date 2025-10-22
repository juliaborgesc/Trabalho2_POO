public class Eletrico extends Veiculo {
    private double autonomiaBat;
    private double capacidadeBat;

    public Eletrico(String marca, String modelo, int anoFab, int mesFab, int anoMod, double valor,
                    double autonomiaBat, double capacidadeBat) {
        super(marca, modelo, anoFab, mesFab, anoMod, valor);
        this.autonomiaBat = autonomiaBat;
        this.capacidadeBat = capacidadeBat;
    }

    public int getAutonomia() {
        return (int) Math.round(autonomiaBat);
    }

    public String toString() {
        return super.toString() + " (Elétrico)";
    }
}