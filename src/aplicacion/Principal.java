import java.util.Scanner;
import dominio.*;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms to approximate pi: ");
        int puntosTotales = input.nextInt();
        input.close();
        System.out.println("Pi is approximately " + Matematicas.generarNumeroPi(puntosTotales));
    }
}
