package lab8;

import java.io.*;

public class CopyDataThread extends Thread {
	String file1;
	String file2;

	public CopyDataThread(String file1, String file2) {
		super();
		this.file1 = file1;
		this.file2 = file2;
	}

	public void run() {
		try {
			FileReader fr =new FileReader(file1);
			FileWriter fw = new FileWriter(file2,true);
			int x=0;
			int count = 0;
			while((x =fr.read())!=-1) {
				fw.write((char) x);
				fw.flush();
				count++;
				if (count == 10) {
					System.out.println("10 characters copied");
					Thread.sleep(5000);
					count = 0;
				}
					
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


