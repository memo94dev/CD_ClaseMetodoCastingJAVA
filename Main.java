class Vehiculo {
    public void arrancar() {
        System.out.println("El vehículo está arrancando");
    }
}

class Coche extends Vehiculo {
    public void tocarBocina() {
        System.out.println("El coche está tocando la bocina.");
    }
}

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.arrancar();
        miCoche.tocarBocina();
    }
}