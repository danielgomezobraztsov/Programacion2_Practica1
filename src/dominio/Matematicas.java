package dominio;
import java.lang.Math;
//import java.util.Random;

public class Matematicas {
    public static double generarNumeroPi(int puntosTotales) {
        int aciertos = 0;
        double x = 0;
        double y = 0;
        long high = 1L;
        long low = -1L;
        for (int i = 1; i <= puntosTotales; i++) {
            x = high + (double) (Math.random() * (low - high));
            y = high + (double) (Math.random() * (low - high));

            if ((x*x)+(y*y)<=1){
                aciertos++;
            }

        }
        return 4. * aciertos/puntosTotales;
    }
}

    

