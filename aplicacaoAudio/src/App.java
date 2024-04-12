import classes.Musica;
import classes.Podcast;

public class App {
    public static void main(String[] args) throws Exception {
        
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Feel the melody");
        minhaMusica.setArtista("S3RL");
        minhaMusica.setGenero("Happy hardcore");

        for (int i = 0; i < 10000; i++) {
            
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 4000; i++) {
            
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("The Deep Three");
        meuPodcast.setDescricao("Your favourite NBA´s podtcast!");
        meuPodcast.setHost("Isac, Don and Mo");

        for (int i = 0; i < 40000; i++) {
            
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            
            meuPodcast.curtir();
        }


        System.out.println("Curtidas da música: " + minhaMusica.getCurtidas());
        System.out.println("Visualizações da música: " + minhaMusica.getTotalReproducoes());
        System.out.println("Curtidas do podcast: " + meuPodcast.getCurtidas());
        System.out.println("Visualizações do podcast: " + meuPodcast.getTotalReproducoes());
    }
}
