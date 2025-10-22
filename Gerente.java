public class Gerente extends Funcionario {
    private String senha;

    public Gerente(String nome, String cpf, int dia, int mes, int ano, double salario, String senha) {
        super(nome, cpf, dia, mes, ano, salario);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validarAcesso(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }

    public String toString() {
        return nome + " - CPF: " + cpf + " - Gerente";
    }
}   