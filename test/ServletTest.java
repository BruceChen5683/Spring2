
import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;

public class ServletTest {


    @Test
    public void testServlet(){
        MockHttpServletRequest request = new MockHttpServletRequest();

        request.addParameter("username","zhangsan");

//        MockHttpSession session = new MockHttpSession();
//        session.setAttribute("hello","world");

        //实力恶化Ｓｅｒｖｌｅt对象
        //调用Servlet对象的doGet、doPost方法
        Assert.assertEquals("zhangsan",request.getParameter("username"));




    }
}
