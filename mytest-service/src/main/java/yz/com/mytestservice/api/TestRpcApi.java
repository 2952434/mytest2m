package yz.com.mytestservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yz.com.core.models.Result;
import yz.com.mytestresource.resource.MyMetaTestResource;
import yz.com.resource.metas.resourcemodel.model.AreaInfoModel;
import yz.com.service.gis.api.RemoteStyleNodeService;
import yz.com.service.gis.models.Style;

import java.util.List;


@RestController
public class TestRpcApi {
    private final RemoteStyleNodeService styleNodeService;

    // public TestRpcApi(RemoteStyleNodeService styleNodeService) {
    //     this.styleNodeService = styleNodeService;
    // }
    private final MyMetaTestResource myMetaTestResource;

    public TestRpcApi(RemoteStyleNodeService styleNodeService, MyMetaTestResource myMetaTestResource) {
        this.styleNodeService = styleNodeService;
        this.myMetaTestResource = myMetaTestResource;
    }
    // private final RemoteAreaCodService areaCodService;

    // public TestRpcApi(RemoteStyleNodeService styleNodeService, RemoteAreaCodService areaCodService) {
    //     this.styleNodeService = styleNodeService;
    //     this.areaCodService = areaCodService;
    // }

    @GetMapping("/getStyle")
    public Result<Style> test() {
        Style styleNode = styleNodeService.getStyleNode("default", "100000", "style.stl", "TAV");
        return Result.ok(styleNode);
    }

    // @GetMapping("/getAreaInfos")
    // public Result<Result<List<AreaInfoModel>>> getAreaInfos() {
    //     return Result.ok(areaCodService.getByCName("北京市"));
    // }

    @GetMapping("/testAreaModel")
    public List<AreaInfoModel> getinfo() {
        return myMetaTestResource.getAllChildByCCode(100000);
    }
}
