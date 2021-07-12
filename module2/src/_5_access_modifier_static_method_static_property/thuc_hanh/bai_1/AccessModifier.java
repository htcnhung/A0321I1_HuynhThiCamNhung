package _5_access_modifier_static_method_static_property.thuc_hanh.bai_1;

public class AccessModifier {
    //1. Private
//    class A{
//
//        private int data=40;
//
//        private void msg(){System.out.println("Hello java");}
//
//    }
//    public class Simple{
//
//        public static void main(String args[]){
//
//            A obj=new A();
//
//            System.out.println(obj.data);//Compile Time Error
//
//            obj.msg();//Compile Time Error
//
//        }
//
//    }
//2. Default
//    package pack;
//
//    class A{
//
//        void msg(){System.out.println("Hello");}
//
//    }
//package mypack;
//
//import pack.*;
//
//    class B{
//
//        public static void main(String args[]){
//
//            A obj = new A();//Compile Time Error
//
//            obj.msg();//Compile Time Error
//
//        }
//
//    }

    //3. Protected
//    package pack;
//
//    public class A{
//
//        protected void msg(){System.out.println("Hello");}
//
//    }
//    package mypack;
//
//import pack.*;
//
//
//
//    class B extends A{
//
//        public static void main(String args[]){
//
//            B obj = new B();
//
//            obj.msg();
//
//        }
//
//    }

    // 4. Public

//    package pack;
//
//    public class A{
//
//        public void msg(){System.out.println("Hello");}
//
//    }
//package mypack;
//
//import pack.*;
//
//
//
//    class B{
//
//        public static void main(String args[]){
//
//            A obj = new A();
//
//            obj.msg();
//
//        }
//
//    }


}
