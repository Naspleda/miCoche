import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int total;
        Coche miCoche = new Coche();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese puertas: ");
        Integer numero = sc.nextInt();
        miCoche.puertas = numero;
        total = add(miCoche.puertas, 3);
        miCoche.puertas = total;
        System.out.println(miCoche.puertas);

    }

    public static class Coche{
        public int puertas;
    }

    public static int add(int puertas, int n){
        return puertas + n;
    }


}

