import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * springboot
 *
 * @Title: PACKAGE_NAME
 * @Date: 2020/8/21 19:58
 * @Author: wfg
 * @Description:
 * @Version:
 */
@SpringBootTest
public class TestJDBC {

    @Autowired
    private DataSource dataSource;
    @Test
    public void contextLoads() {
        System.out.println("=============");
        System.out.println(dataSource.getClass());
        try {
            System.out.println("=============");
            System.out.println(dataSource.getConnection());
            System.out.println("=============");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
