package yz.com.mytestservice.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yz.com.mytestresource.resource.DisasterIndexrResource;

/**
 * @Author: 李君祥
 * @create: 2023-08-22 14:22
 * @description:
 */
@RestController
@Api(value = "测试")
public class DiasaterIndexApi {

    @Autowired
    private DisasterIndexrResource disasterIndexrResource;


    @ApiOperation(value = "根据省份和插值类型插值", produces = "application/json")
    @GetMapping("interpolationByProvince")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate", value = "开始时间yyyyMMdd", required = true, example = "20220610"),
            @ApiImplicitParam(name = "endDate", value = "结束时间yyyyMMdd", required = true, example = "20220614"),
            @ApiImplicitParam(name = "province", value = "请输入省份如：河南", required = true, example = "江西"),
            @ApiImplicitParam(name = "tmpCode", value = "插值类型如：v12001(平均气温) v12052(最高气温) v12053(最低气温) v13201(降雨量)", required = true, example = "v12001")
    })
    public String interpolationByProvince(String startDate, String endDate, String province, String tmpCode) {
        return disasterIndexrResource.interpolationByProvince(startDate, endDate, province,tmpCode);
    }

}
