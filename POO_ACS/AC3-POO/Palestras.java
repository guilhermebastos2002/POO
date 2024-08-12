public class Palestras {
    String palNome, palData, palLocal;
    int duracao;

    Palestras() {
        this.palData = "adiado";
    }

    Palestras(String palNome, String palData, String palLocal, int duracao) {
        this.palNome = palNome;
        this.palData = palData;
        this.palLocal = palLocal;
        this.duracao = duracao;
    }

    void remarcarPal(String novaPalData) {
        this.palData = novaPalData;
    }
}
