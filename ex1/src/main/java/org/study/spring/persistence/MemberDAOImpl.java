package org.study.spring.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.study.spring.model.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession session;
	private static final String namespace = "org.study.spring.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return session.selectOne(namespace + ".gettime");
	}
	@Override
	public void insertMember(MemberVO vo) {
		
		session.insert(namespace + ".insertMember", vo);
	}

}
