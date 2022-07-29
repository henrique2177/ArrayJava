package exercicio_array;

import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double[] nota = new double[4];
		double result = 0;
		int opcao = 0;
		double modifica;
		int modificaN = 0;
		
		
		System.out.println("Digite a primeira nota para Português:");
		  nota[0] = sc.nextDouble();
		
		
		
		System.out.println("Digite a primeira nota para Matematica:");
		nota[1] = sc.nextDouble();
		
		System.out.println("Digite a terceira nota para Quimica:");
		nota[2] = sc.nextDouble();
		
		System.out.println("Digite a quarta nota para Geografia:");
		nota[3] = sc.nextDouble();
		
		
		
		for(double n : nota) {
			
		
			System.out.println("Nota em Português" + (n= nota[0]));
			
			System.out.println("Nota em Matematica" + (n = nota[1]));
			
			System.out.println("Nota em Quimica" + (n = nota[2]));
			
			System.out.println("Nota em Geográfia" + (n = nota[3]));
			break;
		}
			
			System.out.println("Deseja Modicar alguma nota ? 1 - Para modificar 2 - Para Continuar");
			opcao = sc.nextInt();
			
			
			if(opcao == 1) {
				System.out.println("Qual nota desja modificar?\n"
						+ "1 - Portugês\n"
						+ "2 - Matematica\n"
						+ "3 - Quimica\n"
						+ "4 - Geografia\n");
				
				modificaN = sc.nextInt();
				
				if(modificaN == 1) {
					System.out.println("Qual novo valor?");
					modifica= sc.nextDouble();
					
					System.out.println("Modificou portugues:" +(nota[0] = modifica));
					System.out.println("--------------------------------------------");
				}
				
				else if(modificaN == 2) {
					System.out.println("Qual novo valor?");
					modifica= sc.nextDouble();
					
					System.out.println("Modificou Matematica:" +(nota[1] = modifica));
					System.out.println("--------------------------------------------");
				}
				
				else if(modificaN == 3) {
					System.out.println("Qual novo valor?");
					modifica= sc.nextDouble();
					
					System.out.println("Modificou Quimica:" +(nota[2] = modifica));
					System.out.println("--------------------------------------------");
				}
				
				else if(modificaN == 4) {
					System.out.println("Qual novo valor?");
					modifica= sc.nextDouble();
					
					System.out.println("Modificou Geográfia:" +(nota[3] = modifica));
					System.out.println("--------------------------------------------");
					
				}
					
					result = (nota[0] + nota[1] + nota[2] + nota[3]) /4;
					System.out.println("A média da nota de Prtugues " +nota[0] +" + Matematica + "+nota[1]+" Quimica + "+nota[2] + " Geografia "+nota[3] + " é de :" +result);
					
				}else if(opcao == 2)  {
					result = (nota[0] + nota[1] + nota[2] + nota[3]) /4;
					System.out.println("A média da nota de Portugues " +nota[0] +" + Matematica + "+nota[1]+" Quimica + "+nota[2] + " Geografia "+nota[3] + " é de :" +result);
				}
				else {
					System.out.println("Opção invalida. Encerrando ....");
					
					
					
				}
				
				
				
							
			}
}
				
				
				/*
				switch(modifica) {
				case 1 :
					System.out.println("Modificou portugues");
					nota[0] = modifica;
					return;
					
				case 2 :
					System.out.println("Modificou matematica");
					nota[1] = modifica;
					return;
					
				case 3 :
					System.out.println("Modificou Quimica");
					nota[2] = modifica;
					return;
					
				case 4 :
					System.out.println("Modificou Geográfia");
					nota[3] = modifica;
					return;
					
				}
				*/
				/*
			}else if(opcao == 2)  {
				result = (nota[0] + nota[1] + nota[2] + nota[3]) /4;
				System.out.println(result);
			}
			else {
				System.out.println("Escolha invalida escolha v alida");
				opcao =sc.nextInt();
			}
			
			break;
			
	*/
		
		
	
	

