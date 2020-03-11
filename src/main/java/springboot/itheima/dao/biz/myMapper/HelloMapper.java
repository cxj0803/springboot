package springboot.itheima.dao.biz.myMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springboot.itheima.entity.User;

@Mapper
public interface HelloMapper {
	List<Map<String, String>> getHello();
	
	User getUser(@Param("user_id") Integer userId);
}
