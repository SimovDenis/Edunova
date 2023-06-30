package edunova;

public class E01Metode {
	
	public static void main(String[] args) {
		
		tip1();
		
		tip1(2);
		
		int broj = 7;
		tip1(broj);
		
		tip1(true);
		
		System.out.println(zbroj100Brojeva());
		
		System.out.println(slucajniBroj(1, 100));
		
		
	}
	
	
	// 1. tipa void, ne prima parametre
	
	/* bez navođenja načina pristupa */ static void tip1() { // bez navođenja načina pristupa je package scope
		System.out.println("Hello tip 1");
	}
	
	// 2. tipa void, prima parametre
	private static void tip1(int i) {
		System.out.println("Tip 2 " + i);
	}
	
	protected static void tip1(boolean i) {
		System.out.println("Tip 2 " + i);
	}
	
	// 3. određenog tipa, ne prima parametre
	public static int zbroj100Brojeva() {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}	
		
		return sum;
	}
	
	// 4. određenog tipa, prima parametre
	static int slucajniBroj(int min, int max) {
		
		int manji = min < max ? min : max;
		int veci = min < max ? max : min;
		
		return (int)Math.floor(Math.random() * (veci - manji + 1) + manji);
		
	}
	
	
	
	
	
	
	
	
	
	

}
