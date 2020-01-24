import java.util.*;

/**
 * Respuesta2
 */

public class Respuesta2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(new Integer(i));
        }

        System.out.println("Tamaño inicial de numbers: " + numbers.size());

        // prueba para método 1
        // System.out.println("iteraciones = " + borrar(numbers));

        // prueba para método 2
        // System.out.println("iteraciones = " + borrar2(numbers));

        // prueba método genérico, este es el más eficiente

        int[] borraRegs = { 9995, 9997, 8000 }; // array con los elementos a ordenar, no importa
        // el número ni el orden de los elementos que incluya

        System.out.println("iteraciones = " + borrar3(numbers, borraRegs));

        // comprobamos que el registro de valor más bajo ya no contiene el valor inicial
        System.out.println("Longitud actual de numbers: " + numbers.size() + "\n contenido de la posición 8000: "
                + numbers.get(8000));

    }

    // solución con bucle for. Se considera que no sabemos que el último registro
    // a borrar es el 8000
    public static int borrar(ArrayList<Integer> l) {
        int contador = 1;
        for (int i = 9999; i >= 0; i--) {
            if (l.get(i) == 9997 || l.get(i) == 9995) {
                l.remove(i);

            }
            if (l.get(i) == 8000) {
                l.remove(i);
                break;
            }

            contador++;
        }
        return contador;
    }

    // Solución con while. En este caso considero que ya que sabemos que el último
    // registro a borrar es el
    // 8000 el bucle debe parar en este registro.

    public static int borrar2(ArrayList<Integer> l) {
        int contador = 1;
        int numReg = 9999;
        while (numReg >= 8000) {
            if (l.get(numReg) == 9997 || l.get(numReg) == 9995 || l.get(numReg) == 8000) {
                l.remove(numReg);
            }
            contador++;
            numReg--;
        }
        return contador;
    }

    public static int borrar3(ArrayList<Integer> l, int[] regs) {
        Arrays.sort(regs); // ordeno
        int contador = 0;
        // int numReg = l.size();
        for (int i : regs) {
            l.removeIf(n -> n.equals(i));
            contador++;
        }

        return contador;
    }
}
