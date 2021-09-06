// Instituto Politécnico Nacional - ESCOM 
// Alejandra Orozco Aguilar 
// Luis Ernesto Guzman Castro
// Analisis de algoritmos  Grupo: 3CV11
// Prof. Luna Benoso Benjamin
// Ciclo escolar 22/1

package analisisalgoritmosp1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Euclides {

    private ArrayList<Integer> list;
    private int cont;
    private int puntos;
    private String ar[][];

    public Euclides() {
        list = new ArrayList<>();
        cont = 0;
        puntos = 10;
        ar = new String[puntos][2];
        menu();

    }

    private int AgoritmoEuclides(int m, int n) {
        int r;
        cont++;
        while (n != 0) {
            cont++;
            r = m % n;
            cont++;
            m = n;
            cont++;
            n = r;
            cont++;
        }
        cont++;
        cont++;
        return m;
    }

    private void serieFibonacci() {
        int num1 = 1;
        int num2 = 1;
        list.add(num1);
        list.add(num2);
        for (int i = 0; i < puntos; i++) {
            int f = num1 + num2;
            list.add(f);
            num1 = num2;
            num2 = f;
        }
    }

    private void menu() {
        int min = 1;
        this.serieFibonacci();
        int max = list.get(list.size()-2).intValue() ;
        int value;
        int value2;
        DocExcel ex;
        Random random = new Random();
        
        System.out.println("Elija el Caso");
        System.out.println("1. Peor Caso");
        System.out.println("2. Caso Aleatorio");
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
        switch (op) {
            case "1": //Envia dos numeros consecutivos de la serie fibonacci
                for (int i = 0; i < puntos; i++) {
                    cont = 0;
                    this.AgoritmoEuclides(list.get(i), list.get(i + 1));
                    ar[i][0] = list.get(i + 1).toString();
                    ar[i][1] = String.valueOf(cont);
                }
                ex = new DocExcel(ar);
                break;
            case "2": //Envia dos numeros aleatorios 
                for (int i = 0; i < 10; i++) {
                    cont = 0;
                    value = random.nextInt(max + min) + min;
                    value2 = random.nextInt(max + min) + min;
                    if (value < value2) {
                        this.AgoritmoEuclides(value, value2);
                        ar[i][0] = String.valueOf(value2);
                        ar[i][1] = String.valueOf(cont);
                    } else {
                        this.AgoritmoEuclides(value2, value);
                        ar[i][0] = String.valueOf(value);
                        ar[i][1] = String.valueOf(cont);
                    }
                }
                ex = new DocExcel(ar);
                break;
            default:
                System.out.println("No eligio una opcion valida");
        }
    }
}
