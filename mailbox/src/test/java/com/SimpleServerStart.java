package com;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created by hnair20160706 on 2016/8/6.
 */
public class SimpleServerStart {
    public static void main(String[] args) {
        try{
            // 服务器的监听端口
            Server server = new Server(8080);
            // 关联一个已经存在的上下文
            WebAppContext context = new WebAppContext();
            // 设置描述符位置
            context.setDescriptor("./web/WEB-INF/web.xml");
            // 设置Web内容上下文路径
            context.setResourceBase("./web");
            // 设置上下文路径
            context.setContextPath("/myproject");
            context.setParentLoaderPriority(true);
            server.setHandler(context);
            // 启动

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
