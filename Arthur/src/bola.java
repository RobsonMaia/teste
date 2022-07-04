import java.util.Scanner;

import entities.Dono;
import entities.Escolha;
import entities.Marca;

public class bola {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		Marca nike, adidas;
		nike = new Marca();
		adidas = new Marca();
		
		Escolha nike1, adidas1;
		nike1 = new Escolha();
		adidas1 = new Escolha();
		
		Dono nike2, adidas2;
		nike2 = new Dono();
		adidas2 = new Dono();
		
		System.out.println("=================");
		System.out.println("     2 MARCAS    ");
		System.out.println("=================");
		System.out.println("   ");
		System.out.println("NOME: ");
		nike.n = sc.next();
		adidas.n = sc.next();
		System.out.println("ENDEREÇO: ");
		nike.e = sc.next();
		adidas.e = sc.next();
		System.out.println("CNPJ: ");
		nike.cnpj = sc.nextDouble();
		adidas.cnpj = sc.nextDouble();
		
		System.out.println("=================");
		System.out.println(" ESCOLHA DA BOLA ");
		System.out.println("=================");
		System.out.println("   ");
		System.out.println("TIPO: ");
		nike1.a = sc.next();
		adidas1.a = sc.next();
		System.out.println("COR: ");
		nike1.b = sc.next();
		adidas1.b = sc.next();
		
		System.out.println("=================");
		System.out.println(" DONO DA BOLA ");
		System.out.println("=================");
		System.out.println("   ");
		System.out.println("NOME: ");
		nike2.a = sc.next();
		adidas2.a = sc.next();
		System.out.println("ENDEREÇO: ");
		nike2.b = sc.next();
		adidas2.b = sc.next();
		System.out.println("SEXO: ");
		nike2.c = sc.next();
		adidas2.c = sc.next();
		System.out.println("IDADE: ");
		nike2.d = sc.nextInt();
		adidas2.d = sc.nextInt();
		
		
		System.out.println("USUARIO 1: " + nike2.a + " " +  nike2.b + " " + nike2.c + " " + nike2.d);
		System.out.println("BOLA: " + nike.n + " " + nike.e + " " + nike.cnpj + " " + nike1.a + " " + nike1.b);
		System.out.println("   ");
		System.out.println("USUARIO 1: " + adidas2.a + " " + adidas2.b + " " + adidas2.c + " " + adidas2.d);
		System.out.println("BOLA: " + adidas.n + " " + adidas.e + " " + adidas.cnpj + " " + adidas1.a + " " + adidas1.b);
		
		
		sc.close();
	}

}
