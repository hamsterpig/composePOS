import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Static_FileInOut {
	
	Static_FileInOut(){
		
		
		
	}
	
	static String fileRead(String name){
		String temp = "";
		File file = new File(name); //date
		try{
			if(!file.exists()){ // file not
				FileWriter check = new FileWriter(name); // new creat file
			} else {
				FileReader reader = new FileReader(name); // file Open
				BufferedReader in = new BufferedReader(reader);
				Scanner scan = new Scanner(reader);

					String string;
				    while ((string = in.readLine()) != null) {
				    	temp = temp.concat(string+"\n");
				    	//System.out.println(string);
				      }
				} 
		} catch(IOException e){
			
		}
		return temp;
	}

	
	

}
