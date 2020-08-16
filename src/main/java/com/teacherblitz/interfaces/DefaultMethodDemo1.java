package com.teacherblitz.interfaces;

/**
 * 接口方法案例
 *
 * @author <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since 2020/8/16
 */
public class DefaultMethodDemo1 {

    public static void main(String[] args) {
        MethodClazz clazz = new MethodClazz();
        System.out.println(clazz.accep("hello"));
    }

    static class MethodClazz implements DefaultMethodInterface<String>{

        @Override
        public String accep(String arg0) {

            return String.format("[%s]：%s",
                    this.getClass().getName(),
                    arg0);
        }
    }

    interface DefaultMethodInterface<R> {

        /**
         * 普通方法撒
         * @param arg0
         * @return
         */
        R accep(String arg0);

        /**
         * 默认方法撒
         * @return
         */
        default String getName() {
            return "hello,default method";
        }

        /**
         * 静态方法撒
         */
        static void show() {
            System.out.println("hello,static method");
        }
    }
}
