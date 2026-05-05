package logica;

public class Parcial {

	public Parcial() {
		// TODO Auto-generated constructor stub
	}
	
	public int potencia(int b, int e) throws Exception{
		
		//Según el enunciado el resultado debe ser entero,
		//así que la potencia no puede ser negativa a menos que la base sea 1
		
		if(e == 0) {
			return 1;
		} else if(e < 0 && (Math.abs(b) != 1 && b != 0)) {
			throw new Exception("El resultado será decimal");
		} else if(b == 0 && e < 0) {
			throw new Exception("Indeterminación por dividir por 0");
		}
		
		long resultado = b;
		
		for(int i=1;i<e; i++) {
			resultado = resultado*b;
			if(resultado >  2147483647) {
				throw new Exception("El resultado será mayor que el número valor máximo permitido para un entero");
			}
		}
		
		return (int) resultado;
	}

}
