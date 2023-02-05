public class Cachorro extends Animal {

    public Cachorro() {
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom () {
        System.out.println("O cachorro está latindo...");
    }

    public void correr () {
        System.out.println("O cachorro está correndo...");
    }
}
