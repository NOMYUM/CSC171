import java.io.File;

public class Question5 {
	public static void main(String[] args) {

		File flies = new File("/Users/AsianBoss/eclipse-workspace/Angela C HW 15/");
		File[] listOfFiles = flies.listFiles();
		
		try {
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					System.out.println("FILE " + listOfFiles[i].getName());
				} else if (listOfFiles[i].isDirectory()) {
					System.out.println("DIRECTORY " + listOfFiles[i].getName());
				}
			}
		} catch (Exception e) {
			System.out.println("INVALID FILE DIRECTORY");
		}
	}
}
