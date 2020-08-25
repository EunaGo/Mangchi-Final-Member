package com.aia.mangchi.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.mangchi.dao.MemberDao;
import com.aia.mangchi.model.LoginInfo;
import com.aia.mangchi.model.LoginRequest;
import com.aia.mangchi.model.Member;

@Service
public class MemberLoginService {

	private MemberDao dao;

	@Autowired
	SqlSessionTemplate template;

	public String loginMember(LoginRequest loginRequest, HttpSession session, HttpServletRequest request) {

		dao = template.getMapper(MemberDao.class);

		Member member = null;
		
		LoginInfo loginInfo = null;
		
		String result = "N";
		
		System.out.println(loginRequest.getmId()+loginRequest.getmPw());

		member = dao.selectByIdPw(loginRequest);

		System.out.println("LoginService member: " +member);
	
		if (member != null) {
			
			loginInfo =  member.toLoginInfo();

			session.setAttribute("loginInfo", loginInfo);

			System.out.println("loginInfo >>> " + loginInfo + "로그인 되셨습니다 !!");
			
			result = "Y";
		}

		return result;

	}

}
