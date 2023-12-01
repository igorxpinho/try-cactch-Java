import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch2 {
    public static void main(String[] args) {
        try {
            Scanner scnLargura = new Scanner(System.in);
            System.out.println("Digite a largura");
            Double largura = scnLargura.nextDouble();

            Scanner scnAltura = new Scanner(System.in);
            System.out.println("Digite a altura");
            Double altura = scnLargura.nextDouble();

            System.out.println("O total de metros quadrados é: " + (largura * altura));

            scnLargura.close();
            scnAltura.close();
        } catch (InputMismatchException e) {
            System.out.println("Ops! Houve algum erro...: " + e);
        }
    }
}
