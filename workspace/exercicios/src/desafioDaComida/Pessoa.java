package desafioDaComida;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.calorias;
		}
	}
	
	String apresentar() {
		return "Olá eu sou " + nome + " e peso " + peso + " Kg atualmente!";
	}

}
