public class fileRead{
	public static void main(String[] args){
		File intput = new File("c:/roots.txt");
		File output = new File("output.txt");

		try(FileInputStream fis = new FileInputStream (input)) {
			int content;
			FileOutputStream out = new FileOutputStream(output);
			while((content = fis.read()!= -1)){

				out.write(c);
			}
			fis.close();
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {

		}

		SimpleDateFormate formate = new SimpleDateFormate("yy/mm/dd HH:mm:ss");
		Date current = new Date();
		formate.format(current);
	}
}