public class Gerente extends Funcionario {
    private String senha;

    public Gerente(String nome, String cpf, int dia, int mes, int ano, double salario, double bonus) {
        super(nome, cpf, dia, mes, ano, salario);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validarAcesso(String senha) {
        return this.senha.equals(senha);
    }

    public String toString() {
        return nome + " - CPF: " + cpf + " - Bônus: " + bonus;
    }
}   