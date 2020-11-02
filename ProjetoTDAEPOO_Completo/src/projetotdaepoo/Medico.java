
package projetotdaepoo;

import javax.swing.JOptionPane;

/**
 * @author Cleber Silva
 */
public class Medico extends Pessoa implements Login{
    
    private int CRM;
    private String especialidade;
    private boolean residente; 

    public Medico() {
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isResidente() {
        return residente;
    }

    public void setResidente(boolean residente) {
        this.residente = residente;
    } 

    @Override
    public void fazerLogin(String usuario, String senha) {
        System.out.println("valor do usuario " + usuario);
        if( usuario.equalsIgnoreCase("Jose")){
                   JOptionPane.showMessageDialog(null, " Login Sucesso" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                   
                   JOptionPane.showMessageDialog(null, " O que seja fazer? \n 1 - Atender Paciente" , "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);

        }else{
                JOptionPane.showMessageDialog(null, " Usuário ou Senha inválidos, tente novamente" , "Sistema de Vacina", JOptionPane.ERROR_MESSAGE);
        }


    }
}
