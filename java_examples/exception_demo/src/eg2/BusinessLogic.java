package eg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BusinessLogic {

	public void openFile(String fileName) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(fileName);
	}
}
