package classes;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int curtidas;
    private int avaliacao;
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void curtir() {

        this.curtidas++;
    }

    public void reproduzir() {

        this.totalReproducoes++;
    }

}
