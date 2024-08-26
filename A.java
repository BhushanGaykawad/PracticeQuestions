class MyThread extends Thread
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("Childd thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
		
	}
}

class A 
{
	
	public static void main(String[] args) throws Exception
	{
		MyThread t= new MyThread();
//		t.setDaemon(true);
		t.start();
		System.out.println("end of main");
		t.stop();
		
	}

}
 