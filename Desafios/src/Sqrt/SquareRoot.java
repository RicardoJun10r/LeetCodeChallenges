package Sqrt;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(newtonRaphson(2));
    }

    static int newtonRaphson(int x) {
        BigDecimal numero = new BigDecimal(x);
        BigDecimal y = BigDecimal.ONE;
        BigDecimal condicao_parada = new BigDecimal("0.0000001");
        BigDecimal diferenca;
        final int SCALE = 10;
        while (true) {
            BigDecimal yProximo = y
                    .add(numero.divide(y, SCALE, RoundingMode.HALF_DOWN))
                    .divide(new BigDecimal(2), SCALE, RoundingMode.HALF_DOWN);
            diferenca = yProximo.subtract(y).abs();
            if (diferenca.compareTo(condicao_parada) <= 0) {
                return yProximo
                        .setScale(0, RoundingMode.DOWN)
                        .intValue();
            }
            y = yProximo;
        }
    }

}
