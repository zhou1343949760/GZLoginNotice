package com.hzgzsoft.gz_login_notice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.superluo.textbannerlibrary.ITextBannerItemClickListener;
import com.superluo.textbannerlibrary.TextBannerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 登录页面 通知
 * Created by yimi
 * on 2021/8/12
 */
public class LoginNotice_java {


    public final static String GET_NOTICE_INFO = "Notice.ashx";

    public static TextBannerView textbanner = null;

    public static void initNotice(Context context, LinearLayout linearLayout,
                                  String retrofitHead, ShowWebView showWebView) {

        View view = LayoutInflater.from(context).inflate(R.layout.noticeview, null);


        textbanner = view.findViewById(R.id.loginNotice_banner);


        linearLayout.addView(textbanner);


        //创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(retrofitHead) // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析
                .build();
        //创建 网络请求接口 的实例
        GetRequest request = retrofit.create(GetRequest.class);
        //对 发送请求 进行封装
        Call<List<LoginMessage>> call = request.getCall();
        //发送网络请求(异步)
        call.enqueue(new Callback<List<LoginMessage>>() {
            //请求成功时回调
            @Override
            public void onResponse(Call<List<LoginMessage>> call, Response<List<LoginMessage>> response) {
                //处理返回的数据结果
                if (response.body() == null || response.body().isEmpty()) {
                    textbanner.setVisibility(View.GONE);
                    return;
                } else {
                    textbanner.setVisibility(View.VISIBLE);
                }
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < response.body().size(); i++) {
                    list.add(response.body().get(i).getTitle() + "\n" + response.body().get(i).getInformation());
                }
                textbanner.setDatas(list);
                textbanner.setItemOnClickListener(new ITextBannerItemClickListener() {
                    @Override
                    public void onItemClick(String data, int position) {


                        showWebView.onShowWebView(response.body().get(position).getId());
//                        new DialogShowWebview(context, "", "http://slzyjc.lyj.zj.gov.cn/slzy/admin/NoticeShow.aspx?Id=" + response.body().get(position).getId(), 110).show();
                    }
                });
            }

            //请求失败时回调
            @Override
            public void onFailure(Call<List<LoginMessage>> call, Throwable throwable) {
                textbanner.setVisibility(View.GONE);
                System.out.println("连接失败");
            }
        });

    }



    public static void textbanner_stopViewAnimator(){
        try {
            //防止出现重影
            if (textbanner != null) {
                textbanner.stopViewAnimator();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void textbanner_startViewAnimator(){
        try {
            //防止出现重影
            if (textbanner != null) {
                textbanner.startViewAnimator();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
