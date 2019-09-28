package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		
		int[] values = new int[100]; //definiramo array koji moze sadrzavati 100 elemenata
		values[2] = 1000;//definirali smo da u elementu 2 bude vrijednost 1000 (index polje 3 jer se broji od 0 (nule))
		values[99] = 766;
		System.out.println(values[99]);
		
		String[] words = new String[] {"My", "name", "is"};
		
		System.out.println(words[2]);

	}

}
