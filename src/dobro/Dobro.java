package dobro;

public class Dobro {

	// Armazena o numero de instancias
	private static int instancias = 0;

	// armazena o ultimo valor usado por metodo dobro(int)
	public int ultimoValor;

	// construtor que atualiza o numero de instancias
	public Dobro() {
		instancias++;
	}

	// retorna o numero de instancias
	public static int getInstancias() {
		return instancias;
	}

	// Calcula o dobro
	public int dobro(int valor) {
		ultimoValor = valor;
		return 2 * valor;
	}

}
