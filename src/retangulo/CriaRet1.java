package retangulo;

public class CriaRet1 {

	public static void main(String[] args) {
		//Variaveis auxiliares recebem converção dos argumentos
		double larg = Double.parseDouble("9");//primeiro numero
		double alt = Double.parseDouble("36");//segundo argumento 
		//cria objeto
		Retangulo retangulo = new Retangulo(alt,larg);
		//uso ímplicito de Retangulo.toString() exibe info do objeto
		System.out.println("Retangulo[ "+retangulo.getLargura()+" x "+retangulo.getAltura()+" ]");
	}

}
