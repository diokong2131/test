package co.yedam.prj.member.serviceImpl;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;



import co.yedam.prj.member.service.MemberService;
import co.yedam.prj.member.vo.MemberVO;

@Repository
public class MemberServiceImpl implements MemberService {

	@Autowired
	SqlSession session;
	
	@Override
	public MemberVO login(MemberVO vo) {

		return session.selectOne("login",vo);
	}

}
