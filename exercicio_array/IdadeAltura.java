package exercicio_array;

import java.util.Locale;
import java.util.Scanner;

public class IdadeAltura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int[] idade = new int [5];
		float [] altura = new float [5];
		
		System.out.println("Primeira pessoa Digite sua idade:");
		idade[0] = sc.nextInt();
		
		System.out.println("Primeira pessoa Digite sua altura:");
		altura[0] = sc.nextFloat();
		
		System.out.println("Segunda pessoa Digite sua idade:");
		idade[1] = sc.nextInt();
		
		System.out.println("Segunda pessoa Digite sua altura:");
		altura[1] = sc.nextFloat();
		
		System.out.println("Terceira pessoa Digite sua idade:");
		idade[2] = sc.nextInt();
		
		System.out.println("Terceira pessoa Digite sua altura:");
		altura[2] = sc.nextFloat();
		
		System.out.println("Quarta pessoa Digite sua idade:");
		idade[3] = sc.nextInt();
		
		System.out.println("Quarta pessoa Digite sua altura:");
		altura[3] = sc.nextFloat();
		
		System.out.println("Quinta pessoa Digite sua idade:");
		idade[4] = sc.nextInt();
		
		System.out.println("Quinta pessoa Digite sua altura:");
		altura[4] = sc.nextFloat();
		
		System.out.println("Primeira pessoa idade: " + idade[0] + " Altura:  %. 2f " +altura[0]);
		System.out.println("---------------------------------------");
		
		System.out.println("Segunda pessoa idade: " + idade[1]  + " Altura: %. 2f " + altura[1]);
		System.out.println("---------------------------------------");
		
		System.out.println("Terceira pessoa idade: " + idade[2]  + " Altura:  %. 2f " + altura[2]);
		System.out.println("---------------------------------------");
		
		System.out.println("Quarta pessoa idade: " + idade[3]  + " Altura:  %. 2f " + altura[3]);
		System.out.println("---------------------------------------");
		
		System.out.printf("Quinta pessoa idade: " + idade[4]  + " Altura:  %. 2f " + altura[4]);
		System.out.println("---------------------------------------");
		
		
		

	}

}
