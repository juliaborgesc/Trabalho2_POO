public class Venda {
    private Veiculo veiculo;
    private Cliente cliente;
    private double desconto;
    private Data d;
    private String chassi;

    public Venda(Veiculo veiculo, Cliente cliente, double desconto, int dia, int mes, int ano, String chassi) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.desconto = desconto;
        this.d = new Data(dia, mes, ano);
        this.chassi = chassi;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Data getData() {
        return d;
    }

    public String getChassi() {
        return chassi;
    }

    public double getDesconto() {
        return desconto;
    }

    public double valor(){
        return this.veiculo.getValor() - this.desconto;
    }

    public void setDesconto(double desconto,Gerente gerente, String senha){
        if (gerente.validarAcesso(senha)){
            this.desconto = desconto;
        } else {
            System.out.println("Acesso negado. Desconto não alterado.");
        }
    }

     public String toString() {
        return "Veiculo: " + veiculo.toString() + "\n" +
               "Cliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf() + " - " + cliente.getEmail() + "\n" +
               "Valor da venda: R$" + valor() + "\n" +
               "Data: " + d.getDia() + "/" + d.getMes() + "/" + d.getAno();
    }

}