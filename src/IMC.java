import java.util.Scanner;

 public class IMC {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

         System.out.println ("|-=-=-=-=-=-=-=-=-=-=-=-=-=|");
          System.out.println ("|-=-=-=  I   M   C   -=-=-=|");
           System.out.println ("|-=-=-=-=-=-=-=-=-=-=-=-=-=|");

        System.out.println ("Informe a sua altura: ");
         double A = scanner.nextDouble();

         System.out.println ("Informe o seu peso:");
          double P = scanner.nextDouble();

           double Imc = P / (A * A);

        if (Imc <= 18.5) { System.out.printf ("Magreza, IMC : %.1f%n" , Imc);}
         else if  (Imc <= 24.9) { System.out.printf ("Peso normal, IMC: %.1f%n " , Imc);}
          else if (Imc <= 29.9) { System.out.printf ("Sobrepeso, IMC: %.1f%n" , Imc);}
           else if (Imc <= 39.9) { System.out.printf ("Obesidade, IMC: %.1f%n " , Imc);}
            else if (Imc >= 40.0 ) { System.out.printf ("Obesidade grave, IMC: %.1f%n " , Imc);}

              System.out.println ("|-=-=-=-=-=-=-=-=-=-=-=-=-|");

                scanner.close();





    }
}