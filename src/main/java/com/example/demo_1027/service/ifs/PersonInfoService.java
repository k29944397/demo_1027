package com.example.demo_1027.service.ifs;

import java.util.List;

import com.example.demo_1027.entity.PersonInfo;

public interface PersonInfoService {
	
	public void addInfo(PersonInfo person_info);
	
	public void addInfoList(List<PersonInfo> list);	
}
