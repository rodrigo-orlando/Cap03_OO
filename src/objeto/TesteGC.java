package objeto;

public class TesteGC {

	public static void main(String[] args) {
		System.out.println("Instancias = " + Objeto.getInstancias());
		for (int i = 0; i < 10; i++) {
			@SuppressWarnings("unused")
			Objeto o = new Objeto();
		}
		System.out.println("Instancias = " + Objeto.getInstancias());
		System.gc();//Aciona garbage collector
		System.out.println("Instancias = "+Objeto.getInstancias());
	}

}
