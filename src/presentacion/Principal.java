package presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import logica.Parcial;

public class Principal {
	
	private BufferedReader br;
	
	public Principal() {
		Parcial p = new Parcial();
		this.br = new BufferedReader(new InputStreamReader(System.in));
		
		int op;
		do {
			System.out.println("1. Calcular potencia \n0. Salir");
			op = this.leerDato();
			if(op == 1) {
				try {
				System.out.println("Ingrese la base, deben ser enteros: ");
				int b = this.leerDato();
				System.out.println("Ingrese la potencia, debe ser entero: ");
				int e = this.leerDato();
				
					System.out.println(p.potencia(b, e));
				}catch (NumberFormatException ex) {
		            System.out.println("Debe ser un int.");
		            continue;
		        } catch (Exception ex) {
					// TODO Auto-generated catch block
					System.out.println(ex.getMessage());
					continue;
		        }

			}
		} while(op != 0);

		/// Por si se quiere probar llamando directamente
		//try {
			//System.out.println(p.potencia(-8, 3));
			//System.out.println(p.potencia(2, 2));
			//System.out.println(p.potencia(2, 24));
			//System.out.println(p.potencia(2, 31));
			//System.out.println(p.potencia(2, -5));
			//System.out.println(p.potencia(0, -5));
		//} catch (Exception e) {
		//	System.out.println(e.getMessage());
		//	e.printStackTrace();
		//}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Principal();

	}
	

	public int leerDato() {
		int dato = 0;
		try {
			dato = Integer.parseInt(this.br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dato;
	}

}
