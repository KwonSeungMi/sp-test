package spStudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {
	
	
	public static void CopyFile(String inputFile, String outputFile) {
		final int BUFFER_SIZE=512;
		int readLen;
		
		try {
			InputStream inputStream = new FileInputStream(inputFile);
			OutputStream outputStream = new FileOutputStream(outputFile);
			
			byte[] buffer = new byte[BUFFER_SIZE];
			
			while((readLen = inputStream.read(buffer)) != 1) {
				outputStream.write(buffer,0,readLen);
			}

			inputStream.close();
			outputStream.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void FileDirList(String path) {
		File directory = new File(path);
		File[] fList = directory.listFiles();
		try {
		for(File file:fList) {
			if(file.isDirectory()) {
				//System.out.println("["+file.getName()+"]");
				FileDirList(file.getPath());
			}
			else {
				System.out.println(file.getCanonicalPath() + ": " + file.length() +"bytes");
				
				if(file.length() >= 3072) {
					CopyFile(file.getPath(), file.getPath());
				}
			
			}
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileDirList("/Users/kwonseungmi/eclipse-workspace/testFile");
		
	}

}
