package java_basics;

public class LoopsPractice {

	public static void main(String[] args) {

		int count  = 0;
		while(count <= 100) {
			System.out.println("Ivan: " + count);
			count = count + 1;//potrebno je za while petlju definirati da svaki put kad ude doda 1 jer ce se inace izvrsavati beskonacno
			
			if(count == 30) {
			//ako zelimo zaustaviti while petlju, dodamo uvjet i u njega upisemo break;
			break;
			}
		}
		
	}

}
