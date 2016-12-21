package dobro;

public class UsaDobro {

	public static void main(String[] args) {
		//Uso do metodo estatico da clase sem einstância
		System.out.println("Numero de instancias de Dobro = " + Dobro.getInstancias());
		//Declara e inicializa variavel inteira com valor arbitrario
		int x = 7;
		System.out.println("Iniciando objeto Dobro");
		Dobro d = new Dobro();//Instancição
		//Uso de metodo estático e não estático da classe Dobro
		System.out.println("Numero Instancias de Dobro = " + Dobro.getInstancias());
		System.out.println("O dobro de " + x + " = "+d.dobro(x));
		System.out.println("Ultimo valor usado: " + d.ultimoValor);
	}

}
