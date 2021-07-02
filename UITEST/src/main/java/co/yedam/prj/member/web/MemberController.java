package co.yedam.prj.member.web;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.yedam.prj.member.service.MemberService;
import co.yedam.prj.member.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired(required=true)
	MemberService memberDao;
	
	 @RequestMapping("memberLoginForm")
	 public String memberLoginForm(@ModelAttribute("member")MemberVO vo,HttpSession session,Model model) {
		 String id = (String)session.getAttribute("id");
		 model.addAttribute("id", id);
		 return "member/memberLoginForm";
	 }
	 
	 
	 @PostMapping("memberLogin")
	 public String memberLogin(MemberVO vo, Model model, HttpSession session){
		
		 vo = memberDao.memberLogin(vo);
		 String chk = null;
		 System.out.println(vo);
		 if(vo == null) {
			 chk ="fail";
			 model.addAttribute("chk",chk);
			 return "member/memberLogin";
			
			 
		 } else {
			 chk = "suc";
			 session.setAttribute("id", vo.getId());
			 model.addAttribute("member", vo);
			 model.addAttribute("chk",chk);
		 }
		 return "member/memberLogin";
	 }
}
