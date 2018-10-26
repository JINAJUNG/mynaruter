package my.naruter.outsourcing.controller.site;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import my.naruter.outsourcing.service.SignService;
import my.naruter.outsourcing.vo.MemberInfo;

@Controller
public class SignController {
	@Autowired
	private SignService ss;

	@PostMapping(path="/signin")
	//@RequestMapping(value = "/signin", method = RequestMethod.POST)
	@ResponseBody
	public Integer signin(@RequestBody MemberInfo memInfo, HttpSession session) {
		int suc = ss.loginGet(memInfo);
		if(suc==1) {
			session.setAttribute("id", memInfo.getMemberid());
		}
		return suc;
	}
}
