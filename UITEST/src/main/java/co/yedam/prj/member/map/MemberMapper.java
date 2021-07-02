package co.yedam.prj.member.map;

import org.apache.ibatis.annotations.Mapper;
import co.yedam.prj.member.vo.MemberVO;


@Mapper
public interface MemberMapper {
	MemberVO memberLogin(MemberVO vo);
}
