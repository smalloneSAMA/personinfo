package org.zz.personinfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("org.zz.personinfo.mapper")
@EnableCaching
@SpringBootApplication
public class PersoninfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersoninfoApplication.class, args);
    }

}
