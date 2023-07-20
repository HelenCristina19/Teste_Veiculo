package revisao;

public class TesteVeiculo {

	public static void main(String[] args) {
		Veiculo meuCarro = new Veiculo();
		Veiculo carroHelen= new Veiculo("Ford", 10);
		
		meuCarro.defineMarca("mustang");
		//meuCarro.defineKilometrosPorLitro(5);
		
		//carroHelen.defineMarca("Ford");
		//carroHelen.defineKilometrosPorLitro(10); 
		
		System.out.println("Marca: " + meuCarro.obtemMarca() + "\n Quilometros por Litros: " + meuCarro.obtemKilometrosPorLitro());
		System.out.println("Marca: " + carroHelen.obtemMarca() + "\n Quilometros por Litros: " + carroHelen.obtemKilometrosPorLitro());

	}
	

}
