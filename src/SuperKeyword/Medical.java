package SuperKeyword;

public interface Medical {
	int min_fee = 10;
	public void covid();
	public static void testing() {
		System.out.println("medical -- testing");
	}
	default void bloodTest() {
		System.out.println("medical -- bloodtesting");
	}
	

}