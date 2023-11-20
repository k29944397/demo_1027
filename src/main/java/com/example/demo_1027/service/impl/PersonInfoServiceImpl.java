package com.example.demo_1027.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.demo_1027.entity.PersonInfo;
import com.example.demo_1027.repository.PersonInfoDao;
import com.example.demo_1027.service.ifs.PersonInfoService;

@Service
public class PersonInfoServiceImpl implements PersonInfoService {
	
	// @: annotation
	@Autowired
	private PersonInfoDao personInfoDao;

	@Override
	public void addInfo(PersonInfo person_info) {
		String id = person_info.getId();
		String pattern = "[A-Za-z][1-2]\\d{8}";// 條件
		if (StringUtils.hasText(id)) {
			System.out.println("不可為空");
			return;
		} else if (person_info.getId().matches(pattern)) {
			System.out.println("id正確");
		} else {
			System.out.println("id錯誤");
			return;
		}
		personInfoDao.save(person_info);
	}

	@Override
	public void addInfoList(List<PersonInfo> infoList) { // 假設infoList有10筆,1筆有誤就全部失敗
		String pattern = "[a-zA-z]\\w*";
		for (PersonInfo item : infoList) {
			String id = item.getId();
			System.out.println("ID:" + item.getId() + "NAME:" + item.getName() + "AGE:" + item.getAge() + "CITY:"
					+ item.getCity());
//				if (StringUtils.hasText(id) && id.matches(pattern)) {
////					personInfoDao.save(item);
//					personInfoDao.saveAll(infoList);
//				}else {
//					System.out.println("id error");
//					return;
//				}
			if (!StringUtils.hasText(id) || !id.matches(pattern)) {
				System.out.println("id error");
				return;
			}
		}
		personInfoDao.saveAll(infoList);
	}

//	@Override
//    public PersonInfo findByName(String name) {
//        return null;
//    }
	
//	@Override
//	public List<PersonInfo> findByAgeGreaterThan(int age) {
////		List<PersonInfo> personList = personInfoservice.findByAgeGreaterThan(age);
////		for (PersonInfo person : personList) {
////            System.out.println("ID: " + person.getId() +
////                    ", Name: " + person.getName() +
////                    ", Age: " + person.getAge() +
////                    ", City: " + person.getCity());
////        }
////		return personList;
//		return null;
//	}
}
