package myProject30;


public class PrimeNumbers {
	public static void main(String[]args) {
		for(int i=2;i<=100;i++) {
			int total=0;
			for(int a=1;a<=i;a++) {
				if(i%a==0) {
					total+=a;

					
					if(total==i+1) {
						System.out.print(i+" ");
					}
				}
			}

		}
		
  
 }

		
	}


