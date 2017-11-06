package com.delip.web;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.delip.mappers.TimeMapper;

import lombok.extern.java.Log;

@Log //lombok을 이용해 로그를 보겠다는 의미
@RunWith(SpringJUnit4ClassRunner.class) //JUnit으로 실행하겠다는 의미
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}) //해당 경로의 설정파일을 참고하여 실행한다는 의미
public class DeliTest {

	@Inject
	DataSource ds;
	
	@Inject
	TimeMapper timeMapper;
	
	@Test
	public void getTimeTest() {
		System.out.println(timeMapper.getTime());
	}
	
    @Test
    public void testSayHello() throws Exception{
          System.out.println(ds.getConnection());
    }

	
	@Test
	public void test() { 
		System.out.println("success");
	}
    @Test
    public void connectionTest() throws Exception{
          String driver = "com.mysql.jdbc.Driver"; //드라이버를 불러오는 클래스 호출 용도
          String url = "jdbc:mysql://192.168.0.32/deliciousp"; //jdbc:mysql:주소:포트/DB명
          String user = "java97";
          String pw = "java97"; //아이디/비밀번호는 MySQL서버목록에서 우클릭>Edit으로 확인가능
          
          Class.forName(driver);
          Connection con = DriverManager.getConnection(url, user, pw);
          System.out.println(con);
          con.close();
    }

}
