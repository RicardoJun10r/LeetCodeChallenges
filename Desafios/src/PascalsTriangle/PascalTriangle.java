package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 14;
        List<List<Integer>> triangulo = Generate(numRows);

        for (List<Integer> linha : triangulo) {
            System.out.println(linha);
        }
    }

    public static List<List<Integer>> Generate(int numRows) {
        List<List<Integer>> triangulo = new ArrayList<List<Integer>>();
        List<Integer> primeiraLinha = new ArrayList<Integer>();

        if (numRows <= 0) {
            return triangulo;
        }

        primeiraLinha.add(1);
        triangulo.add(primeiraLinha);

        for (int i = 1; i < numRows; i++) {
            List<Integer> linhaAnterior = triangulo.get(i - 1);
            List<Integer> linhaAtual = new ArrayList<Integer>();
            linhaAtual.add(1);

            for (int j = 1; j < i; j++) {
                int valor = linhaAnterior.get(j - 1) + linhaAnterior.get(j);
                linhaAtual.add(valor);
            }
            linhaAtual.add(1);
            triangulo.add(linhaAtual);
        }

        return triangulo;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangulo = new ArrayList<List<Integer>>();
        List<Integer> linha;
        for (int i = 0; i < numRows; i++) {
            linha = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                linha.add(nCr(i, j));
            }
            triangulo.add(linha);
        }
        return triangulo;
    }

    public static int fatorial(int numero) {
        if (numero == 0)
            return 1;
        else
            return fatorial(numero - 1) * numero;
    }

    public static int nCr(int num, int row) {
        return fatorial(num) / (fatorial((num - row)) * fatorial(row));
    }

}
