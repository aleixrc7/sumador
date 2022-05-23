package sumador;

public class ASumar {

	/**
	 * Atributo número del sumatorio
	 */
	public int numero;

	/**
	 * Constructor vacío 
	 */
	public ASumar() {

	}

	//Métodos
	
	/**
	 * Compruba que el número a sumar es de una sola cifra.
	 * @param cad <p>Número en formato de texto </p>
	 * @return numero
	 */
	
	public String sumativo(String cad) {
		String numero = cad;
		if (numero.length() == 1) {
			return (numero + " = " + numero);
		}
		return null;
	}
	
	/**
	 * Compruba que el número a sumar es negativo.
	 * @param cad <p>Número en formato de texto </p>
	 * @return <p>Negativo. Siempre negativo"</p>
	 */
	
	public String siempreNegativo(String cad) {
		String simbolo = cad.substring(0,1);
		if (simbolo.equals("-")) {
			return ("Negativo. Siempre negativo");
		}
		return null;
	}
	
	/**
	 * hace un sumatorio de los digitos obtenidos.
	 * @param cad <p>Número en formato de texto </p>
	 * @return <p>"suma de números"</p>
	 */
	
	public int total(String valor_inicial) {
        int suma = 0;
        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un dígito.
            String digito = valor_inicial.substring(i, i+1);
            suma = suma + Integer.parseInt(digito);  //Conversión de caracter a entero
        }
        return suma;

    }
		
}
