package orientaçãoObjeto;

public class Carro {
	
	Motor motor = new Motor();
	
	void acelerar(){
		if(motor.fatorInjecao < 6.5) {
			motor.fatorInjecao += 0.5;
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 1.0) {
			motor.fatorInjecao -= 0.5;
		}
	}
	
	void ligar() { 
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	//Saber se o motor está ligado
	boolean estaLigado() {
		return motor.ligado;
	}

}
