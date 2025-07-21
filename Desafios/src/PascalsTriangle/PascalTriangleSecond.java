package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleSecond {
    public static void main(String[] args) {
        int row = 3;
        List<Integer> linha = getRow(row);

        System.out.println("Linha " + row + " do Triângulo de Pascal:");
        System.out.println(linha);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangulo = new ArrayList<List<Integer>>();
        List<Integer> primeiraLinha = new ArrayList<Integer>();

        if (rowIndex <= 0) {
            return primeiraLinha;
        }

        primeiraLinha.add(1);
        triangulo.add(primeiraLinha);

        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> linhaAnterior = triangulo.get(i - 1);
            List<Integer> linhaAtual = new ArrayList<Integer>();
            linhaAtual.add(1);

            for (int j = 1; j < i; j++) {
                int valor = linhaAnterior.get(j - 1) + linhaAnterior.get(j);
                linhaAtual.add(valor);
            }
            linhaAtual.add(1);
            triangulo.add(linhaAtual);
            if (i == rowIndex) {
                return triangulo.get(i);
            }
        }

        return primeiraLinha;
    }
}
