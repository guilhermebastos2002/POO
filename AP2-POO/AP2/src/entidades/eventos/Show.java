package entidades.eventos;

import java.time.LocalDate;

public class Show extends Evento {
    private String nomeArtista, generoMusical;

    public Show(String nome, LocalDate data, String local, int ingressosInteira, int ingressosMeia, double precoCheio, String nomeArtista, String generoMusical) {
        super(nome, data, local, ingressosInteira, ingressosMeia, precoCheio);
        this.nomeArtista = nomeArtista;
        this.generoMusical = generoMusical;
        this.tipo = "Show";
    }

    @Override
    public String toDados() {
        return super.toDados() + "|" + getNomeArtista() + "|" + getGeneroMusical();
    }

    // GETTERS

    public String getNomeArtista() {
        return this.nomeArtista;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    // SETTERS

    public void setNomeArtista(String novoArtista) {
        this.nomeArtista = novoArtista;
    }

    public void setGeneroMusical(String novoGenero) {
        this.generoMusical = novoGenero;
    }

    // toString

    @Override
    public String toString() {
        return "\nShow: " + super.toString() + "\n" +
            "Artista: " + this.nomeArtista + "\n" +
            "Gênero musical: " + this.generoMusical + "\n";
    }

}


/* o evento deve conter o nome do artista e o gênero da música. */