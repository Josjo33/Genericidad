import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T> {
    private ArrayList<T> lista; // Lista para almacenar los objetos
    private int tope; // Límite de elementos en la bolsa

    public Bolsa(int tope) {
        this.tope = tope;
        this.lista = new ArrayList<>(); // Se inicializa la lista
    }

    public void add(T objeto) {
        if (lista.size() < tope) { // Se verifica que no haya excedido el límite
            lista.add(objeto);
        } else {
            throw new RuntimeException("No caben más elementos en la bolsa");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }
}
