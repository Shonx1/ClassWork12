package TAsk01;

public class Howtodoit extends Thread{
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0 ; i<1000000;i++) {
					System.out.print("z");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 500000;i>=0;i--){
					try{
						Thread.sleep(1000);
					} catch (Exception e) {
								
					}
					System.out.print(i);
				}
			}
		};
		t1.start();
		t2.start();
	}
}