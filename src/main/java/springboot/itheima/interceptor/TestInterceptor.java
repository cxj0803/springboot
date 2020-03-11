package springboot.itheima.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义拦截器TestInterceptor
 * @author Administrator
 *
 */
@Configuration
public class TestInterceptor implements HandlerInterceptor {

    public TestInterceptor(){}

    /**
     * @Description 在业务处理器处理请求之前被调用。预处理，可以进行编码、安全控制等处理；
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String queryString = request.getQueryString();
        String requestURL = request.getRequestURL().toString();
        if("cxj".equals(queryString)){
        	System.out.println("拦截器1，如入参：" + queryString + "访问地址，" + requestURL);
            return true;
        }else{
        	//返回校验token结果
            returnJson(response);
        	return false;
        }
    }

    /**
     *  @Description 在业务处理器处理请求执行完成后，生成视图之前执行。后处理（调用了Service并返回ModelAndView，但未进行页面渲染），有机会修改ModelAndView
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("拦截器2");
    }

    /**
     *  @Description 在DispatcherServlet完全处理完请求后被调用，也就是说视图渲染已经完毕或者调用者已经拿到结果
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)  {
        System.out.println("拦截器3");
    }
    
    private void returnJson(HttpServletResponse response){
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        try {
            writer = response.getWriter();
            Map<String, Object> result = new HashMap<>();
            result.put("code", "400");
            result.put("msg", "用户令牌token无效");
            result.put("data", null);
            writer.print(result);
            System.out.println("-------用户令牌token无效");
        } catch (IOException e){
        	System.out.println("-------拦截器输出流异常");
        } finally {
            if(writer != null){
                writer.close();
            }
        }
    }
}