
package projetotdaepoo;

/**
 * @author Cleber Silva
 */
public class Enfermeira extends Pessoa implements Login{
    
    private int COREN; 

    public Enfermeira() {
    }

    public int getCOREN() {
        return COREN;
    }

    public void setCOREN(int COREN) {
        this.COREN = COREN;
    }

    @Override
    public void fazerLogin(String usuario, String senha) {

    }
    
}
