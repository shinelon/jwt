## JWT认证demo

###背景
项目中会经常开发一些简单的接口，给可信的第三方使用，使用框架oauth2等，太重了，整个接口才两三个函数，配置oauth2的代码 别业务代码还多，且调用的第三方都相对可信的，得不偿失。

通过JSON Web Token (JWT)+filter实现简单的认证，方便、快捷、性价比高。

###实现功能

- token 可以设置过期时间
- token 可以携带非敏感信息
- 使用filter简单方便拓展


### 快速开始

1. 通过 `/getToken` 获取token


` {"jwt":"eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJpZCIsImlhdCI6MTQ5NjM5MTc2MSwic3ViIjoiVGVzdCIsImlzcyI6Imp3dERlbW8iLCJleHAiOjE0OTYzOTE4NjF9.hAeO4JBpfxMspFJsnf8z7vMZc1UlN6W4BMIsECrOnY8"}` 

2. 在http请求 header中Authorization添加刚刚获取的token


验证成功`application is start up !` 

验证失败`{ "errorMsg": "认证失败"}`  

<a href="http://blog.leapoahead.com/2015/09/06/understanding-jwt/">JWT参考</a>