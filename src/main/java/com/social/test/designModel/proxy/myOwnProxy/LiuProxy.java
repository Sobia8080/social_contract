package com.social.test.designModel.proxy.myOwnProxy;

/**
 * Created by liufangrui on 2018/6/8.
 */
/*
生成代理对象的代码
 */
public class LiuProxy {

    private static final String LN ="\r\n";

    public static Object newProxyInstance(LiuClassLoader loader, Class<?>[] interfaces, LiuInvocationHandler h)
            throws IllegalArgumentException{

        //1、生成源代码
//        String proxySrc = this.generateSrc(interfaces[0]);

        //2、将生成的源代码输出到硬盘，保存为.java文件

        //3、编译源代码，并且生成.class文件

        //4、将class文件中的内容动态加载到JVM中

        //5、返回代理后被代理的对象

        return null;
    }

    /**
     * 源代码需要继承接口
     * @param interfaces
     * @return
     */
    private String generateSrc(Class<?> interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package com.social.test.designModel.proxy.myOwnProxy;")
                .append(LN)
                .append("import java.lang.reflect.Method;")
                .append(LN)
                .append("public class $Proxy0 implements "+interfaces.getName()+"{"+LN)
                .append(1);

        return "";
    }
}
