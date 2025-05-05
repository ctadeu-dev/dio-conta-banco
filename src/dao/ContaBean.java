package dao;

public class ContaBean {
    private Integer numeroConta = 0;
    private Integer digitoConta = 0;
    private String tipoConta = "";
    private ClienteBean cliente = new ClienteBean();
    private AgenciaBean agencia = new AgenciaBean();

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getDigitoConta() {
        return digitoConta;
    }

    public void setDigitoConta(Integer digitoConta) {
        this.digitoConta = digitoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public ClienteBean getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBean cliente) {
        this.cliente = cliente;
    }

    public AgenciaBean getAgencia() {
        return agencia;
    }

    public void setAgencia(AgenciaBean agencia) {
        this.agencia = agencia;
    }
}
