package com.example.demo.test;

import java.util.Map;

//需要typeAndWho，尤其是openId
class Study{

    String baseUrl="https://open.feishu.cn/open-apis/auth/v3/";//配置最佳,下同
    String appId="cli_9c5a97a477a0510b";
    String appSecret="ABriCO3uDYTiI421SvI0LhEdMyS7ol8i";
    String botToken="b-c32772f1-d67b-43e8-9660-4fd34ad5be1e";

    boolean sendMsg(String msg, Map.Entry typeAndWho){ //发送消息
        String tenant_access_token=null;
        //获取tenant_access_token
        tenant_access_token=getTenantAccessToken();
        if(tenant_access_token==null){
            return false;
        }
        //获取成功，有时效
        String url="";//todo 配置最好
        String Authorization="Bearer "+tenant_access_token;
        String ContentType	="application/json";
        //封装head todo

        //有一个typeAndWho，取值如下
//         open_id, employee_id, email; //单聊使用，todo 二选一
//         open_chat_id; //群聊中使用
        String rootId=null;//可空
        String msgType="text";
        String text=msg;
        Map content;//todo 封装text
        //todo feng zhaung body

        Map result=httpPost(null,null,msg);//发送消息

        if(result.get("code").equals(0)){
            return true;
        }
        return false;
    }

    //出错或者失败返回null
    private String getTenantAccessToken() {
        String url=baseUrl+"tenant_access_token/internal/";  //todo 最好配置

        //todo 封装body
        Map result=httpPost(null,null,url);//todo
        //解析result中的tenant_access_token，可能产生错误返回null,todo
        return null;
    }

    private Map httpPost(Object head,Object body,String url) {//todo
        //todo
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new Study().getTenantAccessToken());
    }
    //curl -X POST -H "Content-Type: application/json" -d '{"title": "Hello World", "text": "Hello world"}' https://oapi.zjurl.cn/open-apis/bot/hook/xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
}
