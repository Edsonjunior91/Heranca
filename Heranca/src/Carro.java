
public class Carro extends Veiculo {
												 //sempre que vc fala que algo é um de outra coisa como carro é um veiculo ai vc 
												 // pode herdar carro de veiculo
	private boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	@Override
	public void imprimirDados() {
		super.imprimirDados();    //referencia a superclasse veiculo imprime os dados marca modelo e ano
		System.out.println("Quatro portas: " + quatroPortas);
	}
	
}
