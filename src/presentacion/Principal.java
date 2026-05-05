package presentacion;

import logica.Parcial;

public class Principal {

	public Principal() {
		Parcial p = new Parcial();
		try {
			System.out.println(p.potencia(-8, 3));
			//System.out.println(p.potencia(2, 2));
			//System.out.println(p.potencia(2, 24));
			//System.out.println(p.potencia(2, 31));
			//System.out.println(p.potencia(2, -5));
			//System.out.println(p.potencia(0, -5));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Principal();

	}

}
