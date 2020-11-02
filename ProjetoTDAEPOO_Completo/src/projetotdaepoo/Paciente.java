package projetotdaepoo;

/**
 * @author Cleber Silva
 */
public class Paciente extends Pessoa implements Login{
    private String cartaoDeAgendamento;
    private String cartaoDoSus;

    public Paciente() {
    }

    public String getCartaoDeAgendamento() {
        return cartaoDeAgendamento;
    }

    public void setCartaoDeAgendamento(String cartaoDeAgendamento) {
        this.cartaoDeAgendamento = cartaoDeAgendamento;
    }

    public String getCartaoDoSus() {
        return cartaoDoSus;
    }

    public void setCartaoDoSus(String cartaoDoSus) {
        this.cartaoDoSus = cartaoDoSus;
    }
    
    @Override
    public void fazerLogin(String usuario, String senha) {
    
    }
    
}
