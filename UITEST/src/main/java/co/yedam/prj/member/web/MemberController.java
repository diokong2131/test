package co.yedam.prj.member.web;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.RequestMapping;

import co.yedam.prj.member.service.MemberService;
import co.yedam.prj.member.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	MemberService memberDao;
	
	
	
	
		
	 @RequestMapping("login")
	 public String memberLoginForm(MemberVO vo,Model model) {
		 System.out.println(vo);
		 vo = memberDao.login(vo);
		 model.addAttribute("vo",vo);
		 
		 
		 return "loginok";
	 }
	 
	 
	 
}
