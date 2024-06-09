package com.xyb.chatgpt.interceptor;

import com.xyb.chatgpt.common.Constants;
import cn.hutool.http.ContentType;
import cn.hutool.http.Header;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**

 * @author 云深不知处
 * @description 自定义拦截器
 */
public class OpenAiInterceptor implements Interceptor {

    /** OpenAi apiKey 需要在官网申请 */
    private String apiKeyBySystem;
    /** 访问授权接口的认证 Token */


    public OpenAiInterceptor(String apiKeyBySystem) {
        this.apiKeyBySystem = apiKeyBySystem;
    }

    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {
        // 获得请求信息
        Request original = chain.request();
        // 拿到请求头中用户传递的Key
        String apiKeyByUser = original.header("apiKey");
        String apiKey = Constants.NULL.equals(apiKeyByUser) ? apiKeyBySystem : apiKeyByUser;

        // 构建request
        Request request = new Request.Builder()
                .url(original.url())
                .header(Header.AUTHORIZATION.getValue(), "Bearer " + apiKey)
                .header(Header.CONTENT_TYPE.getValue(), ContentType.JSON.getValue())
                .method(original.method(), original.body())
                .build();

        // 返回执行结果
        return chain.proceed(request);
    }

}
