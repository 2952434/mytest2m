package yz.com.mytestservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yz.com.core.models.Result;
import yz.com.impala.bean.meta.AgmeE002Cod;
import yz.com.mytestresource.resource.My2Resource;
import yz.com.mytestresource.resource.MyResource;


@RestController
public class Test3Api {

    private final MyResource resource;

    private final My2Resource my2Resource;

    public Test3Api(MyResource resource, My2Resource my2Resource) {
        this.resource = resource;
        this.my2Resource = my2Resource;
    }

    @GetMapping("/test31")
    public Result<Long> test25() {
        return Result.ok(resource.getCount());
    }

    @GetMapping("/test32")
    public Result<Long> test32() {
        return Result.ok(my2Resource.getCount());
    }

    @GetMapping("/test33")
    public Result<AgmeE002Cod> test33() {
        return Result.ok(my2Resource.getOne());
    }
}
