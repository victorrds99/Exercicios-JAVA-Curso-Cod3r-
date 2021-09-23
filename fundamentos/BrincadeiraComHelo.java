package fundamentos;

import java.util.Scanner;

public class BrincadeiraComHelo {
			public static void main(String[] args) {
				System.out.println("boa noite solte todo seu odio para alguem");
				Scanner entrada = new Scanner(System.in);
				String rep1 = entrada.nextLine();
				
				if (rep1 == "s") {
					System.out.println(rep1 + 1);
				}
				else {
					System.out.println(rep1 + "voltou pra vc otaria kkkkk");
				}
				
				entrada.close();
			}

}
