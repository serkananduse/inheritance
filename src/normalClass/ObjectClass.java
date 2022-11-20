package normalClass;

import free07_11_22.Methods;

public class ObjectClass {

    public static void main(String[] args) {

        VarriablesClass obj1 = new VarriablesClass();
        VarriablesClass.mesaj="java kolaydir";
        System.out.println(VarriablesClass.mesaj);
        VarriablesClass obj2 = new VarriablesClass();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(obj2.mesaj);



    }
}

