
public class Principal {
    public static void main(String[] args) {
        // Se crea una bolsa con un límite de 3 chocolatinas
        Bolsa<Chocolatina> bolsaCho = new Bolsa<>(3);

        Chocolatina c = new Chocolatina("Milka");
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");

        // Se agregan las chocolatinas a la bolsa
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        // Se recorren e imprimen las chocolatinas en la bolsa
        System.out.println("Contenido de la bolsa de chocolatinas:");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }
    }
}
