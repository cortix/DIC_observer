package observer;

import javax.lang.model.element.PackageElement;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;


/**
 * @author hasancelik on 22.11.2021
 */
public class DependencyInversion {



    public void dependencyInversion() throws Exception {
        Class<?> theClass = Class.forName("observer.Configuration");

        Object object = theClass.getConstructor().newInstance();

        Method[] methods = theClass.getDeclaredMethods();

        for (Method m : methods) {
            m.invoke(object);
            m.setAccessible(true);
            Config config = m.getAnnotation(Config.class);

        }
    }

    public static void readPOM() throws IOException, ClassNotFoundException {

    }


    public static boolean checkConfigurationAnnotationExist() throws ClassNotFoundException {
//        Class<?> configClasses = Module.class.getDeclaringClass();
//        Set<String> packages = ClassLoader.getSystemClassLoader().getUnnamedModule().getPackages();
//        ClassLoader classLoader = DependencyInversion.class.getClassLoader();



//        Class<?>[] classes =  Class.class.getDeclaredClasses();
//        for (Class c: classes){
//            System.out.println(c);
//        }
//
////        Package[] packages  = c.getDefinedPackages();
//
//        boolean isExist = false;
//        for (String p:packages) {
////            Annotation[] annotations = p.getAnnotations();
////            for (Annotation annotation: annotations) {
////                if (annotation.annotationType().equals(Config.class)) {
////                    isExist = true;
////                }
////            }
//        }
        return true;
    }


    public static void main(String[] args) throws ClassNotFoundException, IOException {
        //checkConfigurationAnnotationExist();
        readPOM();
    }
}
