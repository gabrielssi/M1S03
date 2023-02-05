public class Veterinario {

    public void examinar(Animal animal1) {
        System.out.println("O animal está sendo examinado e " +
                "fazendo este barulho...");
        animal1.emitirSom();
    }
}
