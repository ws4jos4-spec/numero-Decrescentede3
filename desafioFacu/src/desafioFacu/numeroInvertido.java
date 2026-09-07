package desafioFacu;
import java.util.Scanner;
public class numeroInvertido{
	private static class variaveis{
		private int numero1 = 0;
		private int numero2 = 0;
		private int numero3 = 0;
		
	}
	private static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		variaveis v = new variaveis();
		
		System.out.println("Digite o primeiro numero");
		v.numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero");
		v.numero2 = sc.nextInt();
		
		System.out.println("Digite o terceiro numero");
		v.numero3 = sc.nextInt();
		
		if(v.numero1  > v.numero2 && v.numero2 > v.numero3 ) {
			System.out.printf("Ordem Decrescente dos numeros %d %d %d",v.numero1, v.numero2, v.numero3);
			}else if (v.numero1 > v.numero3 && v.numero3 > v.numero2 ) {
			System.out.printf("Ordem Decrescente dos numeros %d %d %d",v.numero1, v.numero3, v.numero2);
				 
			}else if(v.numero2  > v.numero1 && v.numero1 > v.numero3 ) {
				System.out.printf("Ordem Decrescente dos numeros %d %d %d",v.numero2, v.numero1, v.numero3);
				}else if (v.numero2 > v.numero3 && v.numero3 > v.numero1 ) {
				System.out.printf("Ordem Decrescente dos numeros %d %d %d",v.numero2, v.numero3, v.numero1);
					 
			}else if(v.numero3  > v.numero1 && v.numero1 > v.numero2 ) {
					System.out.printf("Ordem Decrescente dos numeros %d %d %d",v.numero3, v.numero1, v.numero2);
				}else if (v.numero3 > v.numero2 && v.numero2 > v.numero1 ) {
				System.out.printf("Ordem Decrescente dos numeros %d %d %d",v.numero3, v.numero2, v.numero1);
					 
				}
			}
		}
		
		
	



