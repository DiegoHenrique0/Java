package orienta��oObjeto;

public class Carro {
	
	Motor motor = new Motor();
	
	void acelerar(){
		motor.fatorInjecao += 0.5;
	}
	
	void frear() {
		motor.fatorInjecao -= 0.5;
	}
	
	void ligar() { 
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	//Saber se o motor est� ligado
	boolean estaLigado() {
		return motor.ligado;
	}

}
