package dao;

public class AgenciaBean {
    private BancoBean banco = new BancoBean();
    private  Integer numeroAgencia = 0;
    private  Integer digitoAgencia = 0;
    private  String nomeAgencia = "";

    public BancoBean getBanco() {
        return banco;
    }

    public void setBanco(BancoBean banco) {
        this.banco = banco;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public Integer getDigitoAgencia() {
        return digitoAgencia;
    }

    public void setDigitoAgencia(Integer digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }
}
