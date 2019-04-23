package code_day30;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.junit.jupiter.api.Test;

@SuppressWarnings("all")
public class TestIO {
	
	@Test
	public void test1() throws IOException {
		File f1 = new File("my1.txt");
		f1.createNewFile();
		FileReader fr1 = new FileReader(f1);
		FileWriter fw1 = new FileWriter("my1.txt",true);
		fw1.write("山光悦鸟性,潭影空人心"+"\n"+"万籁皆俱静,但余钟磐音");
		fw1.close();
		
		char[] f1arr = new char[15];
		int len = 0;
		while((len=fr1.read(f1arr))!=-1) {
			System.out.println("本次读取的数据：" + new String(f1arr,0,len));
		}
		fr1.close();
		
		
	
		
//		Properties ps = System.getProperties();
//		Set entrySet = ps.entrySet();
//			for (Object object : entrySet) {
//				System.out.println(object);
//			}
//				//System.out.println(ps.toString();
//				
//		Properties pps = new Properties();
//		pps.getProperty(key)
		
	}
	
	
	
}
