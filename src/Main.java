public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("animal1",5);

        Cachorro cachorro1 = new Cachorro("Luara", 3);

        Cavalo cavalo1 = new Cavalo("Crislan", 1);

        Preguica preguica1 = new Preguica("Robertinho", 9);

        System.out.println("O animal de nome " + animal1.getNome()+" de idade " +
                animal1.getIdade());
        animal1.emitirSom();
        animal1.correr();

        System.out.println("O cachorro de nome " + cachorro1.getNome()+" de idade " +
                cachorro1.getIdade());
        cachorro1.emitirSom();
        cachorro1.correr();

        System.out.println("O cavalo de nome " + cavalo1.getNome()+" de idade " +
                cavalo1.getIdade());
        cavalo1.emitirSom();
        cavalo1.correr();

        System.out.println("A preguiça de nome " + preguica1.getNome()+" de idade " +
                preguica1.getIdade());
        preguica1.emitirSom();
        preguica1.subirArvore();

        Veterinario veterinario1 = new Veterinario();

        veterinario1.examinar(animal1);
        veterinario1.examinar(cachorro1);
        veterinario1.examinar(cavalo1);
        veterinario1.examinar(preguica1);

    }
}
