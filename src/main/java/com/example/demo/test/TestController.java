package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @RequestMapping("/")
    public String test(){
        return "hello world";
    }
    @RequestMapping("/test")
    public Map test2(){
        return new HashMap(){{
            put("name","leishuai");
            put("age",21);
        }};
    }

    public static void main(String[] args) {

    }

}

/*
    curl -X POST \
  https://open.feishu.cn/open-apis/message/v3/send/ \
  -H 'Authorization: Bearer t-cffcb5254d3d5e6673828f7d00eabc4a392284c8' \
  -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache' \
  -d '{
    "email":"leishuai.9510@bytedance.com",
    "msg_type": "text",
    "content": {
        "text": "test content"
    }
}'

 curl -X POST \
  https://open.feishu.cn/open-apis/auth/v3/tenant_access_token/internal/ \
   -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache' \
  -d '{
    "app_id":"cli_9c5a97a477a0510b",
    "app_secret":"ABriCO3uDYTiI421SvI0LhEdMyS7ol8i"
}'
     */

