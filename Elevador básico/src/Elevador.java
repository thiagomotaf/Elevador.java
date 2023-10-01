import java.util.Scanner;

	public class Elevador {

	    Scanner ler = new Scanner(System.in);

	    static boolean podefinalizar = false;
	    int andar;
	    int totalandares;
	    int capacidade;
	    int pessoas;


	    public void inicializar() {
	        capacidade = 11;
	        totalandares = 8;
	        andar = 0;
	        pessoas = 0;
	    }

	    public void entrar() {

	        if (pessoas <= (capacidade - 1)) {
	            limpaTela();
	            System.out.println("Digite quantas pessoas irão entrar no elevador: ");
	            int somaPessoa = pessoas + ler.nextInt();

	            if (somaPessoa <= capacidade) {
	                pessoas = somaPessoa;
	                System.out.println("\nAgora tem " + pessoas + " pessoas no elevador.");
	            } else {
	                System.out.println("O número de pessoas que desejam entrar no elevador é superior ao limite permitido.");
	            }
	        } else {
	            limpaTela();
	            System.out.println("O número de pessoas no elevador já está em sua capacidade máxima");
	        }
	    }

	    public void sair() {

	        if (pessoas > 0) {
	            limpaTela();
	            System.out.println("Digite quantas pessoas irão sair do elevador: ");
	            int subtracao = ler.nextInt();

	            if (subtracao < pessoas) {
	                pessoas = pessoas - subtracao;
	                System.out.println("Agora temos " + pessoas + "no elevador.");
	            } else {
	                System.out.println("O número de pessoas que desejam sair do elevador é superior ao número total de pessoas no elevador.");
	            }
	        } else {
	            System.out.println("O elevador já se encontra vazio.");
	        }
	    }

	    public void subir() {

	        if (andar <= 8) {

	            System.out.println("Digite quantos andares você deseja subir: ");
	            int andaresSubir = ler.nextInt();

	            if ((andar + andaresSubir) <= 8) {
	                andar = andar + andaresSubir;
	                avisoAndar();
	            } else {
	                System.out.println("O número de andares que você deseja subir ultrapassa o número de andares do prédio.");
	                avisoAndar();
	            }
	        } else {
	            System.out.println("Você já se encontra no último andar!");
	        }
	    }

	    public void descer() {

	        if (andar > 0) {

	        System.out.println("Digite quantos andares você deseja descer: ");
	        int andaresDescer = ler.nextInt();

	            if (andaresDescer <= andar) {
	                andar = andar - andaresDescer;
	                avisoAndar();

	            } else {
	                System.out.println("O número de andares que você deseja descer iria além do térreo");
	                avisoAndar();
	            }
	        } else {
	            System.out.println("Você já se encontra no andar térreo!");
	        }
	    }

	    public void finalizar() {
	        if (andar == 0 && pessoas == 0) {
	            System.out.println("Código finalizado");
	            podefinalizar = true;
	        }
	    }

	    public void avisoAndar() {
	        if (andar == 0) {
	            System.out.println("Você está no térreo.");
	        } else {
	            System.out.println("Você está no andar N° " + andar);
	        }
	    }

	    public void limpaTela() {
	        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
	    }
	}
