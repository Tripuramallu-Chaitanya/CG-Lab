package lab8;

public class FileProgram {

	public static void main(String[] args) {
		CopyDataThread copy = new CopyDataThread("D://source.txt","D://target.txt");
		copy.start();

	}

}
