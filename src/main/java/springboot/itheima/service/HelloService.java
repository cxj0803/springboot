/**
 * @author 蔡
 */
package springboot.itheima.service;

import java.util.List;
import java.util.Map;

import springboot.itheima.entity.User;

public interface HelloService {
	List<Map<String, String>> getMsg();
	
	User getUser();
}
