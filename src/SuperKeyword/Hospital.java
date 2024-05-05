package SuperKeyword;

import constructorconcept.Testing;

public class Hospital implements Medical{
	int min_fee = 50;
	public void treatment() {
		System.out.println(min_fee + Medical.min_fee);
		covid();
		bloodTest();
		
	}
	@Override
	public void covid() {
		System.out.println("hospital -- covid");
		
	}
	
	//by using super keyword we can't access parent interface(by default variables r static & final) variables

}
