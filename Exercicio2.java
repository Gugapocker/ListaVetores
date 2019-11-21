import java.util.Scanner;
public class Exercicio2 {
	public static void main (String [] args) {
		Scanner ler = new Scanner ( System.in); 
		double valor;
		System.out.println("Informe quanto o cliente gastou");
		valor = ler.nextDouble();
		
		
	    //se for menor que 100 Reais
		if (valor < 100) {
			 int  nhera = 0;
			    nhera = ler.nextInt();	
                System.out.println("Pagamento somente a vista ou em duas vezes ");
		    	System.out.println("\n");
		        System.out.println("Didgite 1 para a vista ");
		 	    System.out.println("Didgite 2 para parcelar em 2 vezes ");
		 	   if (nhera == 1 ) {
			    	int r = val(valor);	 
			}
		 	  else if (nhera == 2 ) {
			    	int r = parc(valor);	
		    }
		}
		 	   // menu de pagamento 
		System.out.println("Escolha a forma de pagamento ");
	    System.out.println("\n");
	    System.out.println("Digite 1 para a vista ");
	    System.out.println("Digite 2 para parcelar em 2 vezes ");
	    System.out.println("Digite 3 para parcelar em 2 ou em até 10 vezes  ");
	    int  nera = 0;
	    nera = ler.nextInt();
	    
	   
	    if (nera == 1 ) {
	    	int r = val(valor);	 
	}
	    
	    else if (nera == 2 ) {
	    	int r = parc(valor);	 
	    }
	    
		    else if (nera == 3 ) {
		    	int r = par(valor);	
	    }
	    
}
	
	//metodos
	public static int val (double valor) {
		   Scanner ler = new Scanner ( System.in); 
		   valor = valor - valor/100 * 10;
		     System.out.printf(   "O valor a pagar é de : %.2f", valor  );
		return 0;
                                          }

	public static int parc (double valor) {
		  System.out.printf(  "valor da primeira parcela : " + (valor /2)  ); 
		  System.out.printf(  "valor da segunda parcela : " + (valor /2) );
		System.out.println("\n");
		  System.out.printf(   "O valor a pagar é de : %.2f", valor  );
		return 0;
	
	
	}
	
	
	public static int par (double valor) {
		 Scanner ler = new Scanner ( System.in);  
		 
		System.out.printf("informe em quantas vezes o cliente vai parcelar" );
		int parcelas = ler.nextInt();
		valor = valor / parcelas;
		if ( parcelas > 10) {
			System.out.println("O numero maximo possivel de parcelas é de 10, escolha outro numero >:( ");
		  System.out.println(    "\n"   );
			System.exit(0);
		}
		
		for (int i = 1 ; i <= parcelas ; i++  ) {
			
			valor = valor + valor/100 * 10;
	   System.out.printf(   "é o valor a pagar no  " +i+ "° mes de pagamento é de : %.2f" , valor  );
        System.out.println("\n");
        
		   }
		return 0;
	}
	
	
}
	
