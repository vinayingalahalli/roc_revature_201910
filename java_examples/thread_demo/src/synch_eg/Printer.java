package synch_eg;

public class Printer {

	public static synchronized void printPages(Pages pages) {
		System.out.print(pages.getPage1());
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(" "+pages.getPage2());
	}
}
//The class where all the methods are synchronized such class we call it as thread safe or synchronized class


/* Inter thread communication
 * wait()
 * notify()
 * notifyAll()
 * 
 * Producer-Consumer Problem
 */
