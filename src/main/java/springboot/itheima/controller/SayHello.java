package springboot.itheima.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import springboot.itheima.entity.User;
import springboot.itheima.service.HelloService;
import springboot.itheima.support.DemoDto;
import springboot.itheima.support.DemoOutputDto;
import springboot.itheima.support.Errcode;
import springboot.itheima.support.FFResponseModel;
import springboot.itheima.support.ReSult;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/sayHello")
public class SayHello {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value = "/hello", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)// 这里指定RequestMethod，如果不指定Swagger会把所有RequestMethod都输出，在实际应用中，具体指定请求类型也使接口更为严谨。
    @ApiOperation(value="用户", notes="测试用户接口详细描述")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
    }
    )
	public String sayHello(){
		return "hello";
	}
	
	/**

     * 测试接收form表单、URL的数据。不能接收Json数据

     * */
	@RequestMapping(value = "/sqlTest", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)// 这里指定RequestMethod，如果不指定Swagger会把所有RequestMethod都输出，在实际应用中，具体指定请求类型也使接口更为严谨。
    @ApiOperation(value="根据id查询用户的接口", notes="测试根据id查询用户的接口详细描述")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99", required = true)
    public Object formData(){
    	List<Map<String, String>> msg = this.helloService.getMsg();
    	ReSult reSult = new ReSult();
    	reSult.setData(msg);
        return reSult;
    }
	
    @RequestMapping(value = "/show", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)// 这里指定RequestMethod，如果不指定Swagger会把所有RequestMethod都输出，在实际应用中，具体指定请求类型也使接口更为严谨。
    @ApiOperation(value="测试接口", notes="测试接口详细描述")
    public String show(
            @ApiParam(required=true, name="name", value="姓名")
            @RequestParam(name = "name", required=true) String stuName){
        return "success";
    }
    
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/showObj", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)// 这里指定RequestMethod，如果不指定Swagger会把所有RequestMethod都输出，在实际应用中，具体指定请求类型也使接口更为严谨。
    @ApiOperation(value = "post请求调用示例", notes = "invokePost说明", httpMethod = "POST")
    public FFResponseModel<DemoOutputDto> invokePost(@ApiParam(name="传入对象",value="传入json格式",required=true) @RequestBody @Valid DemoDto input) {
        return new FFResponseModel(Errcode.SUCCESS_CODE, Errcode.SUCCESS_MSG);
    }
    
    /**

     * 测试接收form表单、URL的数据。不能接收Json数据

     * */
	@RequestMapping(value = "/getUser", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)// 这里指定RequestMethod，如果不指定Swagger会把所有RequestMethod都输出，在实际应用中，具体指定请求类型也使接口更为严谨。
    @ApiOperation(value="根据id查询用户的接口", notes="测试根据id查询用户的接口详细描述")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "0", required = true)
    public Object getUser(){
    	User msg = this.helloService.getUser();
    	ReSult reSult = new ReSult();
    	reSult.setData(msg);
        return reSult;
    }
}
