package orientaçãoObjeto;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro c1 = new Carro();
		
		System.out.println(c1.estaLigado());
		//ligar
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		//accelerar
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
		//freiar
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.motor.giros());
		
		//desligar
		c1.desligar();
		
		System.out.println(c1.estaLigado());

	}

}
