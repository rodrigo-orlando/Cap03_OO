package retangulo;

public class Retangulo {

	private double largura, altura;// dimenções são campos privados
	// Construtor default aciona outro construtor com this

	public Retangulo() {
		this(2, 1);
	}

	// Construtor paramentrizado
	public Retangulo(double largura, double altura) {
		this.setTamanho(largura, altura);

	}

	// Métodos
	public void setTamanho(double largura, double altura){
		if (largura >=0 && altura >=0) {//Uso explicito de this
			//campos recebem valor das variaveis locais
			this.largura=largura; 
			this.altura = altura;
			
		}
	}

	public double getLargura() {//Uso implicito de this
		return largura;//Retorna valor de campo com this.largura
	}

	public double getAltura() {//Uso implicito de this
		return altura;//retorna valor do campo this.altura
	}

	
	
}
