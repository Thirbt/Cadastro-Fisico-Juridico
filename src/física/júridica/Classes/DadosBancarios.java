
package física.júridica.Classes;

public class DadosBancarios{
    
    // Atributos
    
    private String nomeBanco;
    private String agencia;
    private String conta;
    private String tipoConta;
    
    // Construtor
    
    public DadosBancarios (){
        
        
    }
    
    // Getters and Setters

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String contaCorrente) {
        this.conta = contaCorrente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    
    
}
