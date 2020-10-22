package eg2;

import java.io.FileNotFoundException;

public class PresenterMain {

	public static void main(String[] args)  {
		
		BusinessLogic b=new BusinessLogic();
		try {
			b.openFile("hello.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Some logic after that");
	}

}
