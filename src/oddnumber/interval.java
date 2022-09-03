package oddnumber;

public class interval {
	public static void main(String[] args) {
		int i =1;
		while (i<=5) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			i++;
		}
		System.out.println("Completed");
	}

}
