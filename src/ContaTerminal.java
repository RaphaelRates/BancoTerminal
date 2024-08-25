public class ContaTerminal {
    private String nome;
    private Double saldo;
    private String agencia;
    private int numero;

    public ContaTerminal(String nome, Double saldo,String agencia, int numero){
        setNome(nome);
        setAgencia(agencia);
        setSaldo(saldo);
        setNumero(numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
