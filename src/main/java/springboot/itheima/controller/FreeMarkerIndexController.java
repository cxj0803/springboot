package springboot.itheima.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //标示为controller层
@RequestMapping("/helloHTML")
public class FreeMarkerIndexController {
	@RequestMapping(value="/freemarkerindex")
	public String defaultHandler(Map<String, Object> result){
		result.put("name", "cxj");
		result.put("sex", 1);
		List<String> list = new ArrayList<String>();
		list.add("zhangsan");
		list.add("lisi");
		result.put("userlist", result);
	    return "freemarkerindex";
	}
}
