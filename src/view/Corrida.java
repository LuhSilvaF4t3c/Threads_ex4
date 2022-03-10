package view;
import controller.sapo;

public class Corrida {

	public static void main(String[] args) {
		sapo sapo = new sapo();
		int distancia = 9;
		int pulo_maximo = 3;
		System.out.println("Distância da corrida: " + distancia + " cm. Pulo máximo: " + pulo_maximo + " cm.");
		for(int i=0; i < 5; i++)
			new sapo(pulo_maximo, distancia).start();

	}

}
