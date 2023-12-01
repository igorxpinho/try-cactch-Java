import java.util.Scanner;

public class trycatch1 {
    public static void main(String[] args) {
        try {
            Double gravidade = 9.81;
            Scanner scnPeso = new Scanner (System.in);
            System.out.println("Digite seu peso");
            Double peso = scnPeso.nextDouble();
            System.out.println("Sua massa é de: " + Math.round(peso / gravidade) );
            scnPeso.close();
            Thread.sleep(1);
            
        } catch (InterruptedException e){
            System.out.println("Ops! Houve algum erro...: " + e);
        }
    }
}
