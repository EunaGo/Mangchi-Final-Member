package com.aia.mangchi.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.mangchi.dao.MemberDao;
import com.aia.mangchi.model.Member;

@Service
public class MemberListService {
	
	private MemberDao dao;
	
	@Autowired
	SqlSessionTemplate template;

	public List<Member> memberList(int mIdx){
			
		dao = template.getMapper(MemberDao.class);
	
		System.out.println(mIdx);
		
		List<Member> member = dao.selectList(mIdx);
		
		System.out.println(member);
		return member;
		
	}
	
}
