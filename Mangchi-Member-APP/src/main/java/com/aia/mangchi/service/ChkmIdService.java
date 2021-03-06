package com.aia.mangchi.service;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.mangchi.dao.MemberDao;

@Service
public class ChkmIdService {

	private MemberDao dao;

	@Autowired
	SqlSessionTemplate template;

	public int ChkmId(String mId, HttpServletRequest request) {

		dao = template.getMapper(MemberDao.class);

		int resultCnt = 0;

		resultCnt = dao.selectById(mId);

		if (resultCnt > 0) {
			resultCnt = 1;
		}

		return resultCnt;
	}
}
