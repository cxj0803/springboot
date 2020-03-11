/**
 * @author 蔡
 */
package springboot.itheima.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.itheima.dao.biz.myMapper.HelloMapper;
import springboot.itheima.entity.User;
import springboot.itheima.dao.mybatis.mapper.QxMapper;
import springboot.itheima.entity.Qx;
import springboot.itheima.service.HelloService;

@Service
public class HelloServiceImp implements HelloService {
	@Autowired
	private QxMapper qxMapper;
	@Autowired
	private HelloMapper helloMapper;
	
	@Override
	public List<Map<String, String>> getMsg() {
		// 新增
		Qx qx = new Qx();
		qx.setQxid(2020030404);
		qx.setQx("普宁军埔");
		this.qxMapper.insertSelective(qx);
	    // 查询
	    List<Map<String, String>> list = this.helloMapper.getHello();
		return list;
	}

	@Override
	public User getUser() {
		User user = this.helloMapper.getUser(1);
		return user;
	}
}
