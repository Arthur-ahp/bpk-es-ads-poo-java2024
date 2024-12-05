package heranca;

public class testeAnimal {
    public static void main(String[] args){
        cachorro cachorro = new cachorro("Rex", 5, "Grande");
        gato gato = new gato("Minsi", 7, "Tigre");
        System.out.println(cachorro);
        System.out.println(gato);
        gato.miar();
        cachorro.latir();
    }
}
