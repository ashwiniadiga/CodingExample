package program.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
//Marker Annotation without variable
@interface SmartPhone1{
	
}
//Single/Multi Value Annotation
// Where this element is used
//Meta Anootation
//@Interited for inheritance to extend annotations
@Documented
@Target(ElementType.TYPE)// What level it is used  class/constrution or method or construction, Field
@Retention(RetentionPolicy.RUNTIME)
@Inherited
 @interface SmartPhone{
   String os() default  "Symbian";
   int version() default 1;
}

@SmartPhone(os="Android", version=6)
class NokiaASeries{
	String model;
	int size;
	
	public NokiaASeries(String model, int size){
		this.model = model;
		this.size = size;
	}
	
}

class NokiaBSeries extends NokiaASeries{
	String feature;
	
	public NokiaBSeries(String model, int size) {
		super(model, size);
		// TODO Auto-generated constructor stub
	}

	
	
}
public class AnnotationDemo {
	public static void main(String[] args){
		NokiaASeries obj = new NokiaASeries("Fire", 5);
		Class c = obj.getClass();
		Annotation ann = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone) ann;
		System.out.println(s.os() + s.version());
		
		NokiaBSeries obj1 = new NokiaBSeries("Fire", 5);
		Class c1 = obj1.getClass();
		Annotation ann1 = c1.getAnnotation(SmartPhone.class);
		SmartPhone s1 = (SmartPhone) ann1;
		System.out.println(s1.os() + s1.version());
		
	}

}
