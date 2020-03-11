package springboot.itheima.support;

import java.util.Date;

import com.sun.istack.internal.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 接口请求出参实际数据对象
 * @author Administrator
 *
 */
@Data
public class DemoOutputDto {

    @SuppressWarnings("unused")
	private String res;

    @NotNull
    @ApiModelProperty(value = "defaultOutputStr",example="mockOutputStrValue")
    private String outputStrDemo;

    @NotNull
    @ApiModelProperty(example="6666666",required = true)
    private Long outputLongNum;

    @NotNull
    @ApiModelProperty(example="88888.888")
    private Double outputDoubleNum;

    @NotNull
    @ApiModelProperty(example="2018-12-12T11:11:11.111Z")
    private Date outputDate;
    
}
