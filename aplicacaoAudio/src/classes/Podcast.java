package classes;

public class Podcast extends Audio implements Classificacao{
    
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassifacao() {
        
        if (getCurtidas() >= 1000) {

            return 5;
        } else if (getCurtidas() >= 700) {
            
            return 4;
        } else if (getCurtidas() >= 400) {
            
            return 3;
        } else if (getCurtidas() >= 100) {

            return 2;
        } else {

            return 1;
        }
    }

    
}
