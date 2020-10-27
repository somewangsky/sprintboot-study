package com.zxelec;

import com.zxelec.config.Person;
import com.zxelec.config.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootStudyApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private Teacher teacher;

    @Test
    void contextLoads() {
    }

    @Test
    public void testConfig() {
        System.out.println(person);

        System.out.println(teacher);
    }

}
