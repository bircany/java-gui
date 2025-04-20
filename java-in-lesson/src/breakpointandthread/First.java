package breakpointandthread;

public class First extends Thread {
	private String taskName;
	public First(String name) {
		this.taskName = name;
	
	}
	public void run() {
		System.out.println("Task '" + taskName + "'başladı");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Task '" + taskName + "'tamamlandı");
		
		
		
		/*
		for(int i = 0;i<5;i++) {
			System.out.println(Thread.currentThread().getId() + "değeri" + i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);  
			}
		}
		*/
	}
	

	public static void main(String[] args) {
		Thread t1 = new Thread(new First("Task 1"));
		Thread t2 = new Thread(new First("Task 2"));
		Thread t3 = new Thread(new First("Task 3"));
		t1.start();
		t2.start();
		t3.start();

		
		
		/*
		First t1 = new First();
		First t2 = new First();
		First t3 = new First();
		t1.start();
		t2.start();
		t3.start();
		*/

	}

}
