/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Aluno;
import modelo.AvaliacaoFisica;
import modelo.Professor;
import modelo.Plano;
import modelo.Convenio;
import modelo.AlunoConvenio;


/**
 *
 * @author vinic
 */
public class TesteHeranca {
    public static void main(String[] args) {
        /*Professor p = new Professor();
        p.setNome("Juka");
        p.setCpf("123.123.123-67");
        p.setEspecializacao("Musculação");
        
        System.out.println(p.exibirDados());
        
        Aluno a = new Aluno();
        a.setNome("Vivente");
        a.setMatricula("123");
        
        */
        
        DateTimeFormatter formato = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        /*
        
        a.setDataNascimento(LocalDate.parse("10/01/2008", 
                formato));
        
        
        AvaliacaoFisica av1 = new AvaliacaoFisica(a);
        a.adicionarAvaliacao(av1);
        av1.setProfessor(p);
        
        System.out.println(a.exibirDados());
        
        System.out.println("---- ");
        System.out.println(av1.exibirDados());

       */
        
        
        
        
       /* 
        ////// Teste:   (14/05/2025)
       
        
       Plano p1 = new Plano("Premium", "Acesso total", 150.00);
       
       /// Com desconto:
       
       Aluno a2 = new Aluno();
       
       a2.setNome("Vini");
       
       
       a2.setMatricula("2044");
       a2.setDataMatricula("02/01/2025", formato);
       a2.setPlano(p1);
       a2.verificaDesconto();
       System.out.println(a2.exibirDados());
       
       
       /// Agora, sem desconto:
       
       Aluno a3 = new Aluno();
       
       a3.setNome("Beltrano");
       
       a3.setMatricula("1202");
       a3.setDataMatricula("07/05/2025", formato);
       a3.setPlano(p1);
       a3.verificaDesconto();
       System.out.println(a3.exibirDados());
       
       */
       
      


       ///////Teste: (21/05/2025)
       
       //Criando um aluno normal: 
       
       System.out.println("Aluno normal (Sem convenio) : ");
      
       Aluno aluno = new Aluno();
       aluno.setNome("Marco Polo");
       aluno.setCpf("278.234.421-50");
       aluno.setMatricula("20");
       aluno.setDataMatricula("08/05/2025", formato);
       
       Plano plano = new Plano("Básico", "5 dias de treino semanais e um dia de zumba", 100.00);
       aluno.setPlano(plano);
       
       System.out.println(aluno.exibirDados());
       
       
       System.out.println("\nAluno com convenio : ");
       
       //Criando o aluno p/ testar:
       AlunoConvenio alunoC = new AlunoConvenio();
       alunoC.setNome("Jalin");
       alunoC.setCpf("298.734.421-56");
       alunoC.setMatricula("19");
       alunoC.setDataMatricula("02/04/2025", formato);
       
       //Criando e atribuindo um plano:
       //Plano plano = new Plano("Básico", "5 dias de treino semanais e um dia de zumba", 100.00);
       alunoC.setPlano(plano);
       
       //Criando e atribuindo um convênio: 
       Convenio convenio = new Convenio("J&J Advocacia", "Parceria entre J&J e GymFit", 10);
       alunoC.setConvenio(convenio);
       
       //Imprimindo os dados:
       System.out.println(alunoC.exibirDados());
       
       
       
       
    
     
        
        
        
        
    }
}