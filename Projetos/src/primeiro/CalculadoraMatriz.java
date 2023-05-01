import java.util.Scanner;

public class CalculadoraMatriz {

    // Método para ler valores da matriz
    public static void lerMatriz(String nomeMatriz, int[][] matriz, Scanner entrada) {
        System.out.println("Insira o numero de linhas da matriz " + nomeMatriz + ": ");
        int linhas = entrada.nextInt();
        System.out.println("Insira o numero de colunas da matriz " + nomeMatriz + ": ");
        int colunas = entrada.nextInt();

        // Inicializa a matriz com os valores fornecidos pelo usuário
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println(nomeMatriz + " [" + i + "]" + "[" + j + "]");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    // Método para somar duas matrizes
    public static int[][] somarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return resultado;
    }

    // Método para subtrair duas matrizes
    public static int[][] subtrairMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        return resultado;
    }

    // Método para multiplicar duas matrizes
    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int colunasB = matrizB[0].length;
        int[][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }
}