package projetotdaepoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Cleber Silva
 */
public class Consulta {
    private Medico     medico;
    private Enfermeira enfermeira;
    private Paciente   paciente;
    private Data       data;
    private ArrayList<Vacina> vacinas;
    
    

    public static void main(String[] args) {
        
        Enfermeira objEnfermeira = new Enfermeira();
        Paciente objPaciente = new Paciente();
        Medico objMedico = new Medico();
        
       
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null," Digite 1 caso você for médico \n Digite 2 caso você for enfermeira \n Digite 3 caso você for paciente \n ", "Sistema de Vacina", JOptionPane.QUESTION_MESSAGE));
        
        String usuario, senha;
        switch (opcao){
            case 1:
                    JOptionPane.showMessageDialog(null, " Bem vindo(a) Doutor(a) \n faça login para continuar", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    usuario = JOptionPane.showInputDialog(null," Digite o seu usuário", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    senha   = JOptionPane.showInputDialog(null," Digite a sua senha", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    
                    objMedico.fazerLogin(usuario, senha);
                    
                    break;
             case 2:
                    JOptionPane.showMessageDialog(null, "Bem vinda Enfemeira \n faça login para continuar", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    usuario = JOptionPane.showInputDialog(null," Digite o seu usuário", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    senha   = JOptionPane.showInputDialog(null," Digite a sua senha", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    break;
             case 3:
                    JOptionPane.showMessageDialog(null, "Bem vindo Paciente \n faça login para continuar", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    usuario = JOptionPane.showInputDialog(null," Digite o seu usuário", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    senha   = JOptionPane.showInputDialog(null," Digite a sua senha", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                    break;
            default:
                    JOptionPane.showInputDialog(null, "Opção inválida \n faça login para continuar", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        objMedico.setNome("Jose");
        objMedico.setIdade(18);
        
        System.out.println("O nome do médico é " + objMedico.getNome());
        
        
        objEnfermeira.setNome("Mariana");
        
        System.out.println("O nome da enfermeira é " + objEnfermeira.getNome());
        
        objPaciente.setNome("Joao");
        
        System.out.println("O nome do paciente é " + objPaciente.getNome());

    }
    
}
