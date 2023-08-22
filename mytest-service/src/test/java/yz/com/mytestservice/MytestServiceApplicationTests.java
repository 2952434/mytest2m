package yz.com.mytestservice;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.CacheLoader;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

// @SpringBootTest
class MytestServiceApplicationTests {

    @Test
    void contextLoads() {
        Cache<Object, Object> build = Caffeine.newBuilder()
                .maximumSize(10_000)
                .expireAfterWrite(5, TimeUnit.MINUTES)
                .refreshAfterWrite(1, TimeUnit.MINUTES)
                .build(new CacheLoader<Object, Object>() {
                    @Override
                    public @Nullable Object load(@NonNull Object key) throws Exception {
                        return null;
                    }
                });

        build.put("a", "b");
        System.out.println("build.get(\"a\", o -> \"abc\") = " + build.get("a", o -> "abc"));
        System.out.println("build.get(\"b\", o -> \"abc\") = " + build.get("b", o -> "abc"));
    }

}
