package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;
import day34_GarbageCollection_AccessModifiers.AccessModifiersTest;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
     //   System.out.println(AccessModifiers.defaultData);//default is not visible outside of package
     //   System.out.println(AccessModifiers.privateData);// private is not visible outside the class


        AccessModifiers.method1();
     //   AccessModifiers.method2();//default is not visible outside of package
     //   AccessModifiers.method3();// private is not visible outside the class


    }



}
