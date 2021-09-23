package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println(conjunto.size());
		
		conjunto.add("teste");
		System.out.println(conjunto.size());
		
		conjunto.remove("teste");
		
		System.out.println(conjunto.size());
		
		Set nums = new HashSet();
		
		nums.add(1);
		
		nums.add(2);
		
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//união entre os 2 conjuntos.
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);
		
	}

}
