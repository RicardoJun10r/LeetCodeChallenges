package ExcelSheetColumnNumber;

public class ExcelSCNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZA")); // 26
    }

    public static int titleToNumber(String columnTitle) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int size = columnTitle.length();
        int coluna = 0;
        for (int i = size - 1; i >= 0; i--) {
            int posicao = alfabeto.indexOf(columnTitle.charAt(i)) + 1;
            coluna += posicao * Math.pow(26, i + 1);
        }
        return coluna;
    }

    // A -> 1
    // Z -> 26
    // AA -> 27
    // ZZ -> 702
    // AAA -> 703
}
