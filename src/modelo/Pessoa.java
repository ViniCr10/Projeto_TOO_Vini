/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author vinic
 */
public class Pessoa {

    // atributos
    private LocalDate dataNascimento;
    private String nome;
    private String CPF;
    

    //construtores
    Pessoa(String n) {
        nome = n;
    }

    Pessoa() {

    }

    Pessoa(String nome, String CPF) {
        this.nome = nome;
        setCpf(CPF);
    }

    // métodos
    public String exibirDados() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String aux = "\nDados da Pessoa cadastrada: \n";
        aux += "Nome: " + nome ;
        if (CPF != null) {
            aux += "\nCPF: " + CPF;
        }
        if (dataNascimento != null) {
            aux += "\nData de Nascimento: " + formato.format(dataNascimento);
        }
        
        return aux;
    }

    
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "").trim();
        if (cpf != null && cpf.length() == 11) {
            this.CPF = cpf;
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public void setDataNascimento(LocalDate dtN) {
        dataNascimento = dtN;
    }
    
    
    

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
