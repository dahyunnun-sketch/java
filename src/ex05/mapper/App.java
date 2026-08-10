package ex05.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ex05.dto.EmpDTO;

public class App {
    public static void main(String[] args) {
        String resource = "org/mybatis/example/mybatis-config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
            System.out.println(sqlSessionFactory);

            try (SqlSession session = sqlSessionFactory.openSession()) {
                List<EmpDTO> list = session.selectList("org.mybatis.example.EmpMapper.selectEmp");
                System.out.println("사원정보 조회");
                System.out.println(list);
            }

            System.out.println("한 건 조회 : selectOne");
            // 동적쿼리
            try(SqlSession session = sqlSessionFactory.openSession()){
                EmpDTO emp = session.selectOne("org.mybatis.example.EmpMapper.selectOne", 215);
                System.out.println(emp);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
