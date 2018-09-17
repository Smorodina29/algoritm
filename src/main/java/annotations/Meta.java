package annotations;

import java.lang.reflect.Method;

public class Meta {
    @Myanno(str = "Example of annotation", val=100)
    public static void myMeth(){
        Meta ob = new Meta();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod( "myMeth");
            Myanno anno = m.getAnnotation (Myanno.class);

            System.out.println(anno.str()+" ");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
