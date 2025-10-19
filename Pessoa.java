public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Data nasc;

    public Pessoa(String nome, String cpf, int dia, int mes, int ano) {
        this.nome = nome;
        this.cpf = cpf;
        this.nasc = new Data(dia,mes,ano);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Data getNasc() {
        return nasc;
    }

    public int getIdade(Data hoje) {
        if (this.nasc.getMes() > hoje.getMes()) { return hoje.getAno() - this.nasc.getAno() - 1; }
        else if (this.nasc.getMes() < hoje.getMes()) { return hoje.getAno() - this.nasc.getAno(); }
        else if (this.nasc.getDia() < hoje.getDia()) { return hoje.getAno() - this.nasc.getAno() - 1; }
        else { return hoje.getAno() - this.nasc.getAno() - 1; }
    }

    public String toString() { return this.nome + " - CPF: " + this.cpf; }

}
