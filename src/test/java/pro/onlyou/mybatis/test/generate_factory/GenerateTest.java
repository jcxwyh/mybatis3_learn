package pro.onlyou.mybatis.test.generate_factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GenerateTest {

    private SqlSession sqlSession;

    @BeforeEach
    public void init(){
        try {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            sqlSession = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConn(){
        System.out.println(sqlSession);
    }
}
