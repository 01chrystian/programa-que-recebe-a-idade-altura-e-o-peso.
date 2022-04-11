package Dados;
import java.util.Scanner;
import java.lang.ArithmeticException;

public class DadosDaAnalise {
	
	

		public static void main(String[] args) {
	           
			Scanner sc = new Scanner (System.in);
			
			String nome;
			int idade = 0;
			int peso;
		    int altura = 0;
		    int media = 0;
			int quantidadeP = 0;
			double somaAltura = 0;
			int pesoP = 0;
			
			
			System.out.println("Digite a quantidade de pessoas que deseje preencher os dados: ");
			 int digitP = sc.nextInt();
			
			for ( int p = 0; p < digitP; p++) {
				 
				 System.out.println("-----Preencha seus dados-----");
				  
				  System.out.println("Digite seu nome: ");
				    nome = sc.next();
				  
		          System.out.println("Digite sua idade: ");
	               idade = sc.nextInt();
				     if (idade > 50) {
					   quantidadeP++;
				      }
				 
	              System.out.println("Digite seu peso: ");
	                peso = sc.nextInt();
	            
	              System.out.println("Digite sua altura: ");
	                altura = sc.nextInt();
	               
	             
	              if((idade >= 10) && (idade <= 20)) {
	            	  somaAltura = altura + somaAltura;
	            			  media++; 
	              }
	             
	              if (peso < 40) {
	            	  pesoP++;
	            	  
	             }
	             
				
	          }
			 
			System.out.println("A porcentagem de pessoas com menos de 40kg é: " + pesoP * 100/ digitP  + "%");
			System.out.println("A media da altura é: " + somaAltura/media);
			System.out.println("A quantidade de pessoas com mais de 50 anos são: " + quantidadeP);
		       
		
	}	

}
