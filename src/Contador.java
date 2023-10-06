import java.util.Scanner;
public class Contador {
    public static void main(String[] args){
        

        try{
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        } else {
            for(int indice = parametroUm; indice <= parametroDois; indice ++){
                System.out.println("Número "+ indice);
            }
        }
    }

    public static class ParametrosInvalidosException extends Exception{}
}
