package excecao;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			

			System.out.print(7 / sc.nextInt());

			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finalmente..");
			sc.close();
		}
		
		
		System.out.println("fim");
	}

}
