/**
 * Clase que contiene un método genérico para comparar si dos arreglos tienen los mismos elementos en el mismo orden.
 */
class DemoMetodoGenerico {

    /**
     * Método genérico que compara dos arreglos para determinar si son iguales.
     * Ambos arreglos deben ser del mismo tipo y contener elementos comparables.
     *
     * @param x Primer arreglo a comparar.
     * @param y Segundo arreglo a comparar.
     * @param <T> Tipo genérico que extiende Comparable.
     * @return true si los arreglos son iguales, false en caso contrario.
     */
    static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y) {
        // Si las longitudes son diferentes, los arreglos no son iguales
        if (x.length != y.length)
            return false;

        // Comparación elemento por elemento
        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};

        // Pruebas con los arreglos
        if (igualArrays(nums, nums))
            System.out.println("nums es igual a nums");

        if (igualArrays(nums, nums2))
            System.out.println("nums es igual a nums2");

        if (igualArrays(nums, nums3))
            System.out.println("nums es diferente a nums3");

        if (igualArrays(nums, nums4))
            System.out.println("nums es igual a nums4");
        else
            System.out.println("nums es diferente a nums4");

        // Descomentar para probar con un array de Double (causará error de compilación)
        // Double dvals[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        // if(igualArrays(nums, dvals)) // System.out.println("nums es igual a dvals");
    }
}
