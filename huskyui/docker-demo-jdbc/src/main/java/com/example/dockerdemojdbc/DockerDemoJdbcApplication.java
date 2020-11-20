package com.example.dockerdemojdbc;

import com.example.dockerdemojdbc.dao.UserMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @author huskyui
 */
@SpringBootApplication
public class DockerDemoJdbcApplication implements CommandLineRunner {
    @Resource
    private UserMapper userMapper;


    public static void main(String[] args) {
        SpringApplication.run(DockerDemoJdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userMapper.list());
    }
}
