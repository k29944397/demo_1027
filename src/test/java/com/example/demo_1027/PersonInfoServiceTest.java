package com.example.demo_1027;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_1027.entity.PersonInfo;
import com.example.demo_1027.repository.PersonInfoDao;
import com.example.demo_1027.service.ifs.PersonInfoService;

@SpringBootTest //(classes = { Demo1027Application.class })
public class PersonInfoServiceTest {

	@Autowired
	private PersonInfoService personInfoService;

	@Autowired
	private PersonInfoDao personInfoDao;

	@Test
	public void addPersonInfoTest() {
		personInfoService.addInfo(new PersonInfo("A123456789", "BBB", 60, "CCC"));
	}

	@Test
	public void addPersonInfoTest2() {
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("B133456789", "TCG", 9, "CTT"));
		list.add(new PersonInfo("C223456789", "DNS", 20, "CCC"));
		personInfoService.addInfoList(list);
	}

	@Test
	public void daoTest() {
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("B133456789", "TCG", 9, "CTT"));
		list.add(new PersonInfo("C223456789", "DNS", 20, "CCC"));
		personInfoDao.saveAll(list);
	}

	@Test
	public void daoFindTest() {
		Optional<PersonInfo> infoOp = personInfoDao.findById("A123456789");
		if (infoOp.isEmpty()) {
			System.out.println("not found");
			return;
		} else {
			System.out.println(infoOp.get().getName());
		}
	}

	@Test
	public void daoFindTest2() {
		List<PersonInfo> list = personInfoDao.findAll();
		for (PersonInfo item : list) {
			System.out.println(item.getName());
		}
	}

	@Test
	public void daoFindTest3() { // 是否存在
		boolean result = personInfoDao.existsById("A123456789");
		System.out.println(result);
	}

	@Test
	public void daoFindTest4() {
//		List<PersonInfo> result = personInfoDao.findByCity("CCC");//找住在CCC的
//		List<PersonInfo> result = personInfoDao.findByNameAndCity("BBB", "CCC");//找叫做BBB且住在CCC的
		List<PersonInfo> result = personInfoDao.findByNameOrCity("TCG", "CCC");// 找叫做BBB或住在CCC的
		for (PersonInfo item : result) {
			System.out.println(item.getName());
		}
	}

	@Test
	public void daoFindTest5() {
		List<PersonInfo> result = personInfoDao.findAll();
		for (PersonInfo item : result) {
			System.out.println(item.getId());
			System.out.println(item.getName());
			System.out.println(item.getAge());
			System.out.println(item.getCity());
		}
	}

	//11月13日
	@Test
	public void homeWorekTest1() {
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("N102", "安安", 13, "台南"));
		personInfoService.addInfoList(list);
	}

	@Test
	public void homeWorekTest2() {
		List<PersonInfo> result = personInfoDao.findAll();
		for (PersonInfo item : result) {
			System.out.println(item.getId());
			System.out.println(item.getName());
			System.out.println(item.getAge());
			System.out.println(item.getCity());
		}
	}

	@Test
	public void homeWorekTest3() {
		String nameToFind = "BBB";

		PersonInfo personInfo = personInfoDao.findByName(nameToFind);

		if (personInfo != null) {
			System.out.println("ID: " + personInfo.getId() + ", Name: " + personInfo.getName() + ", Age: "
					+ personInfo.getAge() + ", City: " + personInfo.getCity());
		} else {
			System.out.println("Name error :" + nameToFind + " not found.");
		}
	}

	@Test
	public void homeWorekTest4() {
		personInfoDao.findByAgeGreaterThan(25);
	}

}
