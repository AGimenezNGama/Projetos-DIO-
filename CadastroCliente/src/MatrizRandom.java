import java.util.Random;

public class MatrizRandom {
    public static void main(String[] args){
        
        Random random = new Random(); //função random

        int[][] M = new int[10][10]; // definindo tamanho da matriz

        for(int i = 0; i < M.length; i++) { // desenvolvendo as linhas da matriz
            for(int j = 0; j < M[i].length; j++){ // desenvolvendo as colunas da matriz
                M[i][j] = random.nextInt(100); // add numeros aleatorios

            }
        }
        
        System.out.println("Matriz: ");
        for ( int[] linha: M ){ //lendo as linhas da matriz
            for( int coluna: linha ){ //lendo as colunas da matriz
                System.out.print(coluna + "  "); //printando a matriz
            }
            System.out.println();
        }
        }
    }