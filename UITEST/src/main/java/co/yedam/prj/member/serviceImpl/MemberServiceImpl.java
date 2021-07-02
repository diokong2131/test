package co.yedam.prj.member.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import co.yedam.prj.member.map.MemberMapper;
import co.yedam.prj.member.service.MemberService;
import co.yedam.prj.member.vo.MemberVO;
@Service
@Repository("memberDao")
public class MemberServiceImpl implements MemberService {

	@Autowired(required=true)
	MemberMapper map;
	
	@Override
	public MemberVO memberLogin(MemberVO vo) {

		return map.memberLogin(vo);
	}

}
