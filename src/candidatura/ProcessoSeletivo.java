package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	public static void main(String[] args) {
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Kauã", "David", "Alisson"};
		System.out.println("imprimindo selecionados");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n " + indice + "é: " + candidatos);
		}
		}
	
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Kauã", "David", "Alisson", "Fagner", "Felipe"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 200.0;
		while(candidatosSelecionados < 3 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato +  " foi selecionado");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretemdido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretemdido) {
			System.out.println("Ligar para candidato");
		}else if (salarioBase == salarioPretemdido) {
			System.out.println("Ligar para contra proposta");
		}else {
			System.out.println("Aguardando reultado dos demais candidatos");
		}
	}
}
