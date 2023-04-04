/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

/**
 *
 * @author Manuel Francisco
 */
public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;    //uma estrela
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
        
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    //Implementação dos métodos sobrepostos da Interface

    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
       this.setReproduzindo(false);
    }

    @Override
    public void like() {
     this.setCurtidas(this.curtidas++);
    }

  /*  @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views 
                            + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }*/
    

}
