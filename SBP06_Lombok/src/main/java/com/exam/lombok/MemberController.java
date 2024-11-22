package com.exam.lombok;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MemberController {

	@RequestMapping("/")
	public String root() throws Exception {
		return "커맨드를 사용한 패턴을 입력하고 결과를 확인하세요.";
	}

	@RequestMapping("/reqCmd")
	public String mtdReqCmd(Goods goods) {
		
		return "dataPrn";
	}
}
