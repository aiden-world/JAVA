package code_day30;

import java.io.*;

import org.junit.Test;

public class TestData {
	
	@Test
	public void save() throws IOException{
		String name = "巫师";
		int age = 300;
		char gender = '男';
		int energy = 5000;
		double price = 75.5;
		boolean relive = true;
		
		DataOutputStream dos  = new DataOutputStream(new FileOutputStream("game.dat"));
		dos.writeUTF(name);
		dos.writeInt(age);
		dos.writeChar(gender);
		dos.writeInt(energy);	
		dos.writeDouble(price);
		dos.writeBoolean(relive);
	}	
	
	@Test
	public void reload() throws IOException{
		DataInputStream dis = new DataInputStream(new FileInputStream("game.dat"));
		String name = dis.readUTF();
		int age = dis.readInt();
		char gender = dis.readChar();
		int energy = dis.readInt();
		double price = dis.readDouble();
		boolean relive = dis.readBoolean();
		
		System.out.println(name+"," + age + "," + gender + "," + 
		energy + "," + price + "," + relive);
		
		dis.close();
	}
	
	
	
}