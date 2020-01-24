import java.util.*;

/**
 * EjerciciosRepaso
 */
public class EjerciciosRepaso {

    public static void main(String[] args) {

        Rectangulo r = new Rectangulo(25.2, 45);
        Rectangulo q = new Rectangulo(20.2, 20.2);
        Rectangulo l = new Rectangulo(11, 60);
        Rectangulo m = new Rectangulo(15, 14);

        //List<Rectangulo> rectangulos = new ArrayList<>();
        HashMap<String, Rectangulo> rectangulos = new HashMap<>();

        rectangulos.put("r", r);
        rectangulos.put("q", q);
        rectangulos.put("l", l);
        rectangulos.put("m", m);

        //recorre la colección de rectángulos dando sus características
        for (String i : rectangulos.keySet()) {
            System.out.println("El rectángulo "+i+" tiene: "+
                                rectangulos.get(i)+" y área: "+
                                rectangulos.get(i).area());
        }
        
        //devuelve el mayor de los rectángulos
        System.out.println("El rectángulo mayor es: "+rectanguloMayor(rectangulos));

        //lista los cuadrados
        HashMap<String, Rectangulo> cs = new HashMap<>();    //colección que recibe el resultado
        cs=cuadrados(rectangulos);
        for (String i : cs.keySet()) {
            System.out.println("El rectángulo "+i+ " es cuadrado");
        }

 

    }


    //Función que devuelve el rectángulo mayor    
    public static String rectanguloMayor(HashMap<String, Rectangulo> r) {
        double area=0;
        String clave="";
        for (String i : r.keySet()) {
            if (r.get(i).area()>area) {
                area=r.get(i).area();
                clave=i;
            }
        }
        return clave;
    }

    //Función que devuelve los rectángulos cuadrados
    private static HashMap<String, Rectangulo> cuadrados(HashMap<String, Rectangulo> r) {
        HashMap<String, Rectangulo> cuad = new HashMap<>();
        for (String i : r.keySet()) {
            if(r.get(i).esCuadrado()){
                cuad.put(i, r.get(i));
            }
        }
        return cuad;
    }
    //versión que devuelve un ArrayList
    private static ArrayList<Rectangulo> arrayCuadrados(HashMap<String, Rectangulo> r) {
        ArrayList<Rectangulo> cuad = new ArrayList<>();
        for (String i : r.keySet()) {
            if(r.get(i).esCuadrado()){
                cuad.add(r.get(i));
            }
        }
        return cuad;
    }
}