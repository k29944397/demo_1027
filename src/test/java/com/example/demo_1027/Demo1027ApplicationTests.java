package com.example.demo_1027;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Demo1027ApplicationTests {

	@Test
	//public�v�� //void���^�ǥ����
	public void firstTest() {
		int a = 123456789;
		long b =123456789023456L;
		//�ŧi���o�S�ϥΥX�{���L�C
		//��long�ɦ���J�W�Lint�����n�["L"
		System.out.println(a);
		System.out.println(b);
		//Ctrl+Shift+O = ��S�Ψ쪺import�R��
		//String str = "ABC";
		String str = new String("ABC");
		System.out.println("str: "+str);
	}

}
