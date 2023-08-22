package yz.com.mytestservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yz.com.core.exception.ResourceException;
import yz.com.core.models.Result;
import yz.com.impala.bean.meta.AgmeE002Cod;
import yz.com.impala.bean.znq.SurfDayEle;
import yz.com.mytestresource.resource.MyResource;

import java.util.List;


@RestController
public class Test2Api {

    private final MyResource resource;

    public Test2Api(MyResource resource) {
        this.resource = resource;
    }

    @GetMapping("/test22")
    public Result<Boolean> test() {
        throw new ResourceException("数据为空，无法计算");
    }

    @GetMapping("/test23")
    public Result<List<Integer>> test2() {
        return Result.ok(resource.getData());
    }

    @GetMapping("/test24")
    public Result<List<AgmeE002Cod>> test24() {
        return Result.ok(resource.getE02());
    }

    @GetMapping("/test25")
    public Result<List<SurfDayEle>> test25() {
        List<SurfDayEle> surf = resource.getSurf();
        return Result.ok(surf);
    }
}
