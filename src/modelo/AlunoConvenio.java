/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vinic
 */
public class AlunoConvenio extends Aluno{
    Convenio convenio;
    
    public Convenio getConvenio(){
        return convenio;
    }
    public void setConvenio(Convenio convenio){
        this.convenio = convenio;
    }
    
    
    @Override
    public String exibirDados() {
        String aux = super.exibirDados();
        aux += "\nConvênio: " + (convenio != null ? (convenio.getNome() + " - " + convenio.getValor()) + "%" : "Nenhum convênio encontrado.") ;
        return aux;
    }
    
    
    
    
}
