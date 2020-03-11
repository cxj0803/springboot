package springboot.itheima.support;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 接口请求出参公共类
 * @author Administrator
 *
 * @param <T>
 */
@ApiModel(value="基础返回类",description="基础返回类")
public class FFResponseModel<T> implements Serializable {

    public FFResponseModel(String sUCCESS_CODE, String sUCCESS_MSG) {
		this.code = sUCCESS_CODE;
		this.msg = sUCCESS_MSG;
	}
	private static final long serialVersionUID = -2215304260629038881L;
    // 状态码
    @ApiModelProperty(example="成功")
    private String code;
    // 业务提示语
    @ApiModelProperty(example="000000")
    private String msg;
    // 数据对象
    @SuppressWarnings("unused")
	private T data;
}
