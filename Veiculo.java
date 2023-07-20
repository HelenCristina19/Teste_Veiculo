package revisao;
import java.util.Scanner;

public class Veiculo {
	
	private String marca;
	private int kilometrosPorLitro;
	
	public Veiculo() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o nome da marca: ");
		marca = entrada.next();
		System.out.println("Entre com a quilometragem por litro: ");
		kilometrosPorLitro = entrada.nextInt();
		entrada.close();
		
		
	}
	public Veiculo(String m, int kpl) {
		marca = m;
		kilometrosPorLitro = kpl;
	}
	public void defineMarca(String m) {
		
		marca = m ;
	}
	public void defineKilometrosPorLitro(int kpl) {
		kilometrosPorLitro = kpl;
	}
	public String obtemMarca() {
		return marca;
	}
	public int obtemKilometrosPorLitro() {
		return kilometrosPorLitro;
	}

}
