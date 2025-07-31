public class Pet {
    private String tipo;
    private String nome;
    private boolean limpo;

    public Pet(String tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isLimpo() {
        return limpo;
    }

    // utilizar o setter para o boolean, no caso de alterar valores
    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}
