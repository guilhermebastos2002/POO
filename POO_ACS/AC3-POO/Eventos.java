public class Eventos {
    String evNome, evData, evLocal, info;
    int maxNum;


    //Método construtor
    Eventos() {
        this.evData = "adiado";
    }

    Eventos(String nome, String data, String local, String info, int maxNum) {
        this.evNome = nome;
        this.evData = data;
        this.evLocal = local;
        this.maxNum = maxNum;
        this.info = info;



    }
    void remarcarEv(String novoEvData) {
            this.evData = novoEvData;    
    }   
}
