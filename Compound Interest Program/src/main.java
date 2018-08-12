
public class main {
	
public static void main(String[] args) {	
	double amount;
	double principal = 1000;		// value I'm starting with
	double rate = .01;
	
	for(int day=1;day<=20;day++) {
		amount = principal*Math.pow(1+rate, day);
		System.out.println(day +"   "+ amount);
		}

	}

}

