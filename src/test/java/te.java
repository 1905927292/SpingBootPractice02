import com.guigu.boot.Controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Annotation;

public class te {
    @Test
    public void test01(){
        Class<?> myControllerClass = MyController.class;
        Annotation[] annotations = myControllerClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);

        }

    }
}
//通过反射获取类中的所有注解
