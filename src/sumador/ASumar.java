package sumador;

public class ASumar {

	/**
	 * Atributo n�mero del sumatorio
	 */
	public int numero;

	/**
	 * Constructor vac�o 
	 */
	public ASumar() {

	}

	//M�todos
	
	/**
	 * Compruba que el n�mero a sumar es de una sola cifra.
	 * @param cad <p>N�mero en formato de texto </p>
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
	 * Compruba que el n�mero a sumar es negativo.
	 * @param cad <p>N�mero en formato de texto </p>
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
	 * @param cad <p>N�mero en formato de texto </p>
	 * @return <p>"suma de n�meros"</p>
	 */
	
	public int total(String valor_inicial) {
        int suma = 0;
        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un d�gito.
            String digito = valor_inicial.substring(i, i+1);
            suma = suma + Integer.parseInt(digito);  //Conversi�n de caracter a entero
        }
        return suma;

    }
		
}
