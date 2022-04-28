
package física.júridica.Classes;

public class FornecedoresJuridicos extends PessoaJuridica {
    
    // Atributos
    
    private String nomeEmpresa;
    private String cpnj;
    
    // Contrutor
    
    public FornecedoresJuridicos(){
        
        
    }
    
    // Getters and Setters

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }   
    
    
}
