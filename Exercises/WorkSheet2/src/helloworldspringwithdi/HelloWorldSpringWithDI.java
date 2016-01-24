package helloworldspringwithdi;

/**
 * Created by philhannant on 18/01/2016.
 */
import java.io.FileInputStream;
import java.util.Properties;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
public class HelloWorldSpringWithDI {
    public static void main(String[] args) throws Exception {
// get the bean factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }
    private static BeanFactory getBeanFactory() throws Exception {
// get the bean factory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
// create a definition reader
        PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(
                factory);
// load the configuration options
        Properties props = new Properties();
        props.load(new FileInputStream("/Users/philhannant/IdeaProjects/SDP/Exercises/WorkSheet2/src/helloworldspringwithdi/beans.properties"));
        rdr.registerBeanDefinitions(props);
        return factory;
    }
}