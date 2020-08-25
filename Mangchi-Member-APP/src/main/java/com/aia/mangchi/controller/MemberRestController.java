package com.aia.mangchi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aia.mangchi.model.LoginRequest;
import com.aia.mangchi.model.Member;
import com.aia.mangchi.model.RegRequest;
import com.aia.mangchi.service.ChkmIdService;
import com.aia.mangchi.service.ChkmNickService;
import com.aia.mangchi.service.MemberListService;
import com.aia.mangchi.service.MemberLoginService;
import com.aia.mangchi.service.MemberRegService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/member")
public class MemberRestController {

	@Autowired
	private MemberRegService regService;

	@Autowired
	private MemberLoginService loginService;
	
	@Autowired
	private ChkmIdService chkmIdService;
	
	@Autowired
	private ChkmNickService chkmNickService;
	
	@Autowired
	private MemberListService listService;

	// 회원가입
	@PostMapping
	public int reg(RegRequest regRequest, HttpServletRequest request) {

		System.out.println("regRequest Controller >> " + regRequest);

		return regService.regMember(regRequest, request);
	}

	// 로그인
	@PostMapping("/login")
	public String login(LoginRequest loginRequest, HttpSession session, HttpServletRequest request) {

		System.out.println("loginRequest Controller >> " + loginRequest);

		return loginService.loginMember(loginRequest, session, request);
	}
	
	// 회원 ID 중복체크
	@PostMapping("/chkmId")
	public int chkmId(String mId, HttpServletRequest request) {
		
		System.out.println("chkmId >> " + mId);
		
		return chkmIdService.ChkmId(mId, request);
	}
	
	// 회원 닉네임 중복체크
	@PostMapping("/chkmNick")
	public int chkmNick(String mNick, HttpServletRequest request) {
		
		System.out.println("chkmNick >> "+ mNick);
		
		return chkmNickService.ChkmNick(mNick, request);
	}
	
	// 회원 정보 출력
	@GetMapping("/{mIdx}")				
	public List<Member> getMemberList(@PathVariable("mIdx") int mIdx, HttpServletRequest request){
		System.out.println("list mIdx >> "+mIdx);
		return listService.memberList(mIdx);
	}
}
