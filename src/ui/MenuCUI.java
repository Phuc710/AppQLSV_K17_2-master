package ui;

import java.io.PrintWriter;
import java.util.Scanner;


public class MenuCUI {
	
	//fields
	private PrintWriter screenOutput = null;
	private Scanner keyBoardInput = null;
	private String prompt;
	private String command;
	//functions - methods
	
	//constructor
	public MenuCUI() {
		//
		screenOutput = new PrintWriter(System.out);
	}
	
	public MenuCUI(PrintWriter _screenOutput, Scanner _keyBoardInput) {
		screenOutput = _screenOutput;
		keyBoardInput = _keyBoardInput;
		prompt = "->";
		command = " ";
	}
	
	
	public void controlLoop() {
		// vẽ lên menu
		// vẽ lời nhắc/ hướng dẫn cho người dùng
		screenOutput.println("go lenh \"help\" de duoc ho tro!");
		screenOutput.flush();
		
		
		//vẽ liên tục lên màn hình
		//phải dùng vòng lặp
		// for
		//while
		//do ... while
		while(true) {
			screenOutput.print(prompt);
			screenOutput.flush();
			command = keyBoardInput.nextLine();//"help"
			command = command.trim();
			
			if("help".equalsIgnoreCase(command)) {
				help();//gọi đến hàm help
			}
			
		}

	}
	
	private void help() {
		screenOutput.println("~~~~~~~~~~Console help Menu~~~~~~~~~");
		screenOutput.println("[help] - Ho tro su dung phan mem");
		screenOutput.println("~~~~~~~~~~Console help Menu~~~~~~~~~");
	}
	
	
	

}
