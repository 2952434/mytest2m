package yz.com.mytestservice.api;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import yz.com.core.exception.ResourceException;
import yz.com.core.models.Result;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@RestController
public class TestApi {

    // {
    //     "code": 200,
    //         "message": "",
    //         "fields": null,
    //         "data": true
    // }

    public static class TestPara {

        @NotBlank(message = "姓名不能为空")
        private String name;
        @NotNull(message = "年龄不能为空")
        private int age;

        public String getName() {
            return name;
        }

        public TestPara setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public TestPara setAge(int age) {
            this.age = age;
            return this;
        }
    }


    @GetMapping("/test")
    public Result<Boolean> test() {
        throw new ResourceException("数据为空，无法计算");

        // return Result.ok("ok",true);
    }

    @GetMapping("/test2")
    public Result<TestPara> test2(@Validated @RequestBody TestPara para) {
        return Result.ok("ok", para);
    }
}
