package springboot.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("springboot.itheima.dao.**") // 扫描mapper接口文件
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
