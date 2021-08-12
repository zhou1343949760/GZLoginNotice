package com.hzgzsoft.gz_login_notice;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetRequest {
    /**
     * @GET注解的作用:采用Get方法发送网络请求
     * getCall() = 接收网络请求数据的方法
     * 其中返回类型为Call<*>，*是接收数据的类
     */
    @GET(LoginNotice_java.GET_NOTICE_INFO)
    Call<List<LoginMessage>> getCall();
}
