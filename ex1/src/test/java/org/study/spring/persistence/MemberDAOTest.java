package org.study.spring.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.spring.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	@Autowired
	private MemberDAO dao;
	
	@Test
	public void testGetTime() throws Exception {
		dao.getTime();
	}
	
	@Test
	public void testInsertMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("userid");
		vo.setUsername("username");
		vo.setUserpw("userpw");
		vo.setEmail("user@asd.com");
		
		dao.insertMember(vo);
	}
}
