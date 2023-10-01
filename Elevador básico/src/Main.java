
import java.util.Scanner;

public class Main {

    static Elevador e = new Elevador();

    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao elevador de Thiago e Tiodeivis!");
        e.inicializar();
        menu();
    }

    public static void menu() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma opção:\n" +
                "1- entrar \n" +
                "2- sair\n" +
                "3- subir\n"  +
                "4- descer\n"  +
                "5- finalizar");

        int opt = ler.nextInt();

        switch (opt) {
            case 1:
                e.entrar();
                menu();
                break;
            case 2:
                e.sair();
                menu();
                break;
            case 3:
                e.subir();
                menu();
                break;
            case 4:
                e.descer();
                menu();
                break;
            case 5:
                e.finalizar();
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
                menu();
        }
    }
}
