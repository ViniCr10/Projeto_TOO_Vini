/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author vinic
 */
    public class Aluno extends Pessoa{
    private String matricula;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    private Plano plano;
    private double valorMensalidade;
    private LocalDate dataMatricula;
    
    public void adicionarAvaliacao(AvaliacaoFisica avaliacao) {
        avaliacoes.add(avaliacao);
    }
    
    public String mostrarAvaliacoes(){
        String aux = "Histórico de Avaliações: \n";
        for(AvaliacaoFisica cadaAvaliacao: avaliacoes){
            aux += "->> "+ cadaAvaliacao+"\n";
        }
        return aux;
    }
    public void setPlano(Plano plano)
    {
        this.plano = plano;
        Period periodo = Period.between(dataMatricula, LocalDate.now());
        if(periodo.getMonths() >= 3 || periodo.getYears() >= 1)
        {
            this.valorMensalidade = plano.getValor() * 0.9;
        }
        else
        {
        this.valorMensalidade = plano.getValor();
        }
    }
    public Plano getPlano()
    {
        return plano;   
    }
    public void verificaDesconto()
    {
        Period periodo = Period.between(dataMatricula, LocalDate.now());
        
        if(periodo.getMonths() >= 3 || periodo.getYears() >= 1 || (periodo.getMonths() == 2 && periodo.getDays() == 30))
        {
            this.valorMensalidade = plano.getValor() * 0.9;
        }
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula, DateTimeFormatter formato) {
        this.dataMatricula = LocalDate.parse(dataMatricula, formato);
    }
    
    

    @Override
    public String exibirDados() {
        String aux = super.exibirDados();
        aux += "\nMatricula: "+matricula;
        aux += "\nPlano: " + (plano != null ? plano.getNome() + " - R$ " + plano.getValor(): "Nenhum plano encontrado.");
        aux += "\nAvaliações Físicas Realizadas: " 
                + avaliacoes.size();
        aux += "\nValor da Mensalidade: "
                + valorMensalidade;
        return aux;
    }

    

    
}
    

