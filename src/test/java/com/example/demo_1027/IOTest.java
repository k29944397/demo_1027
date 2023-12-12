package com.example.demo_1027;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class IOTest {
	
	@Test
	public void fileOutputTest() {						//windows���|�n�h�@��"\"
		try(FileOutputStream fos = new FileOutputStream("files\\aaa.txt",true)){
			String str = "���ѤѮ�u�n�I�I";
			byte[] byteArray = str.getBytes();
			fos.write(byteArray);
			System.out.println("�g�J����");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	@Test
	public void fileInputTest() {						//windows���|�n�h�@��"\"
		try(FileInputStream fis = new FileInputStream("files\\aaa.txt")){
//			while(fis.read() != -1) {
//				System.out.println((char)fis.read());
//			}
			while(fis.read()>0) {
				System.out.println((char)fis.read());
			}
			System.out.println("Ū������");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
//	@Test
//	public void fileReaderTest() {
//		try(FileReader fr = new FileReader("aaa.txt")){
//			int i;
//			while((i= fr.read()) > 0){
//				System.out.println((char)fr.read());
//			}catch(Exception e) {
//			}
//		}
//	}
	
}
