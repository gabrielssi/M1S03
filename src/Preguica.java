public class Preguica extends Animal{

    public Preguica() {
    }

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void subirArvore () {
        System.out.println("Preguiça subindo na árvore...");
    }

    public void emitirSom () {
        System.out.println("zzzzzzzzz....");
    }
}
