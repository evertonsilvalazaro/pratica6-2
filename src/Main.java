import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int [] vet=new int[10];
		
		
			
			
		
		for (i=0;i<10;i++) {
			System.out.println("Digite um numero");
			vet[i]=sc.nextInt();
			sc.close();
		}
			   
			   System.out.println("vetor inicial");
				for(i=0;i<vet.length;i++)
					System.out.printf("vet[%d] =%2d/n",i,vet[i]);
			   
			System.out.println("vetor informado");
			for(i=0;i<vet.length;i++)
				System.out.printf("vet[%d] =%2d\n",i,vet[i]);
			   
			System.out.println("vetor negativo");
			for (i=0;i<vet.length;i++)
			if(vet[i]<0)
				System.out.printf("%d: vet[%d] = %d\n", i, i, vet[i]);
			
			
	}
	
}
