package synch_eg;

public class Pages implements Runnable {

	private String page1;
	private String page2;
	
	public Pages() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Pages(String page1, String page2) {
		super();
		this.page1 = page1;
		this.page2 = page2;
		Thread thread=new Thread(this);
		thread.start();
	}



	public String getPage1() {
		return page1;
	}

	public void setPage1(String page1) {
		this.page1 = page1;
	}

	public String getPage2() {
		return page2;
	}

	public void setPage2(String page2) {
		this.page2 = page2;
	}



	@Override
	public void run() {
		Printer.printPages(this);
		
	}
}
