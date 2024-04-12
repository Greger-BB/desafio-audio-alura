package classes;

public class Musica extends Audio implements Classificacao{
    
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassifacao() {
        
        if (getTotalReproducoes() >= 10000) {

            return 5;
        } else if (getTotalReproducoes() >= 7000) {
            
            return 4;
        } else if (getTotalReproducoes() >= 4000) {
            
            return 3;
        } else if (getTotalReproducoes() >= 1000) {

            return 2;
        } else {

            return 1;
        }
    }

    
}
