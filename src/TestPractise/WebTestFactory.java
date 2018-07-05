package TestPractise;

import org.hamcrest.Factory;

/**
 * Created by arvin on 2018/6/3.
 */
public class WebTestFactory {
    @Factory
    public  Object[] CreateInstance(){
        Object [] objects = new Object[10];
        for (int i = 0; i < 10; i ++){
            objects[i] = new WebTest(i*10);
            System.out.println(objects[i]);
    }
        return objects;
    }

}
