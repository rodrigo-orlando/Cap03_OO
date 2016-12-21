package hora;

import java.util.Scanner;

public class UsaHora {

	public static void main(String[] args) {

		Hora hora = new Hora(); //Declara e intancia objetos
		hora.setHorario(15, 30, 10);//Ajusta objetos com valores validos
		System.out.println("Hora: "+ hora.toString());
		
		Scanner sc = new Scanner(System.in); //Prepara o console
		//lê valores de hora, minutoo, segundo em variaveis auxiliares
		System.out.println("Hora ?");
		int h = sc.nextInt();
		System.out.println("Minuto ?");
		int m = sc.nextInt();
		System.out.println("Segundo ?");
		int s = sc.nextInt();
		sc.close();
		hora.setHorario(h, m, s);//Ajusta objeto com valores dados
		System.out.println("Hora: "+ hora.toString());//exibe hora
		if (hora.getHoras()>=18 || hora.getHoras() <= 6)
			System.out.println("É noite");
	
		else 
			System.out.println("É dia!");
			
	} 
		

}
