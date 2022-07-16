import java.util.Scanner;
public class Ejercicio1 {
    
      public static void main(String[] args) {
           
            Scanner scanner = new Scanner (System.in);
            float numero1, numero2, sum, resta, mul, div;
            int ope;
            
        do {
            System.out.println("");
            System.out.println("Seleccione la operacion a realizar:");
            System.out.println("1............................Suma");
            System.out.println("2...........................Resta");
            System.out.println("3..................Multiplicacion");
            System.out.println("4........................Divicion");
            System.out.println("5...........................Salir");
            ope = scanner.nextInt();

            switch (ope)
            {
                case 1:
                System.out.println("Selecciono la opcion sumar");
                System.out.println("Ingrese los numeros a sumar");
                numero1 = scanner.nextFloat();
                 numero2 = scanner.nextFloat();
                 sum = numero1 + numero2;
                    System.out.println("La suma de sus dos numeros es: " + sum);
                    break;

                case 2:
                System.out.println("Selecciono la opcion restar");
                System.out.println("Ingrese los numeros a resta");
                numero1 = scanner.nextFloat();
                 numero2 = scanner.nextFloat();
                 resta = numero1 - numero2;
                     System.out.println("La resta de sus dos numeros es: " + resta);
                     break;

                case 3:
                System.out.println("Selecciono la opcion multiplicar");
                System.out.println("Ingrese los numeros a multiplicar");
                numero1 = scanner.nextFloat();
                numero2 = scanner.nextFloat();
                mul = numero1 * numero2;
                    System.out.println("La multiplicacion de sus dos numeros es: " + mul);
                    break;

                case 4:
                System.out.println("Selecciono la opcion dividir");
                System.out.println("Ingrese los numeros a dividir");
                numero1 = scanner.nextFloat();
                numero2 = scanner.nextFloat();
                div = numero1 / numero2;
                    System.out.println("La divicion de sus dos numeros  es: " + div);
                    break;

                case 5:
                break;
            }
        }while (ope !=  5);
      } 
    }

