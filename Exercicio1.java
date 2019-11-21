import java.util.Scanner;
public class Exercicio1 {
	public static void main (String [] args) {
		Scanner ler = new Scanner ( System.in); 
		
		
		double valor , juros; 
		
		
		System.out.println("Informe o valor que será investido ");
		valor = ler.nextDouble();
		double r =  val (valor);

		
	}

	public static double val (double valor) {
		   Scanner ler = new Scanner ( System.in); 
		   int tempo ; 
		   System.out.println("Informe por quanto tempo predente investir ");
			tempo = ler.nextInt();
		   for (int i = 1 ; i <= tempo ; i++  ) {
			   valor = valor + valor/100 * 1;
			   System.out.printf(   "  é o valor no " +i+ "° mes de investimento  %.2f", valor  );
             System.out.println("\n");		  
		   }
		   
	                    
		return 0;

	}
}
