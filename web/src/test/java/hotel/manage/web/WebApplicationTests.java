package hotel.manage.web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebApplicationTests {

    @Test
    void contextLoads() {

        int a=2;
        int b=a++ << ++a + ++a;
        System.out.println(b);
    }

    @Test
    void contextLoads2() {

        int a=2;
        ++a;
        System.out.println(a);
        ++a;
        System.out.println(a);
        int c=a+a;
        int b=a++<<c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
