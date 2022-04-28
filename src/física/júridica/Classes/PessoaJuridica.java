
package física.júridica.Classes;


public class PessoaJuridica extends Pessoa {
    
    // Atributos
    
    private String cnpj;
    private String tipo;
    
    // Construtor
    
    public PessoaJuridica () {
        
        
    }
    
    // Getters and Setters

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    
    
}
