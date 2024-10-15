public class Casting {
    public static void main(String[] args) {
        // Ampliación conversión automática
        int entero = 100;
        long largo = entero; 
        double doble = largo; 

        System.out.println("Ampliacion del entero 100:");
        System.out.println("Valor Entero (int): " + entero);
        System.out.println("Entero a Largo (long): " + largo);
        System.out.println("Largo a Doble (double): " + doble);

        // Reducción conversión explícita
        double doble2 = 123.45;
        long largo2 = (long) doble2; 
        int entero2 = (int) largo2; 

        System.out.println("Reducción del valor 123.45:");
        System.out.println("Valor Doble (double): " + doble2);
        System.out.println("Valor Largo (long): " + largo2);
        System.out.println("Valor Entero (int): " + entero2);
    }
}
