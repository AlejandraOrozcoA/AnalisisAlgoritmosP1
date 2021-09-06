// Instituto Politécnico Nacional - ESCOM 
// Alejandra Orozco Aguilar 
// Luis Ernesto Guzman Castro
// Analisis de algoritmos  Grupo: 3CV11
// Prof. Luna Benoso Benjamin
// Ciclo escolar 22/1

package analisisalgoritmosp1;
import java.util.Scanner;

public class AnalisisAlgoritmosP1 {

    public static void main(String[] args) {
        System.out.println("Elija el Algorimo");
        System.out.println("1. Operador and");
        System.out.println("2. Algoritmo de Euclides");
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
        switch (op) {
            case "1":
                
                break;
            case "2":
                Euclides eu = new Euclides();
                break;
            default:
                System.out.println("No eligio una opcion valida");
        }
    }   
}
