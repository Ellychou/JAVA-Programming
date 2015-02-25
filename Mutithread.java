import java.lang.*;
import jave.io.*;
import java.util.Random;

public class Mutithread implement Runnable{
	private Thread t;
	private String threadName;

	public Mutithread (String name) {
		threadName = name;
	}

	public void run(){
		writeNum(filename);
	}

	public void start(){
		if (t == null){
			t = new Thread (this, threadName);
			t.start();


		}
	}

	public void writeNum(String filename){
		PrinterWriter pw = new PrinterWriter(filename);

		try{
			for(int i = 0; i < 100; i++){
				Random r = new Random();
				int num = r.nextInt();
				char c = (char)(r.nextInt(26)+'a');
				p.print("" + number);
			}
			p.close();

		}catch(IOEexception ex) {
			ex.printStackTrace();
		}finally{
			try{pw.close();} catch(Exception ex){}
		}
	}

	public static void main(String[] args){
		Mutithread t1 = new Mutithread("thread1");
		T1.start();
		Mutithread t2 = new Mutithread("thread2");
	}
}