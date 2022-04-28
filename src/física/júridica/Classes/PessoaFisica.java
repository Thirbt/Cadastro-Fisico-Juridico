
package física.júridica.Classes;


public class PessoaFisica extends Pessoa {
    
    // Atributos
    
    private String rg;
    private String cpf;
    private String tipo;
    
    // Construtor
    
    public PessoaFisica () {
        
        
    }
    
    // Getters and Setters

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
