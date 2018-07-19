package ${groupId}.service;

import br.com.conductor.heimdall.middleware.spec.ApiResponse;
import br.com.conductor.heimdall.middleware.spec.Helper;
import ${groupId}.util.Constants;

public class SimpleService {

    private Helper helper;

    public SimpleService(Helper helper) {
        this.helper = helper;
    }

    public ApiResponse method() {

        String url = "http://wwww.google.com/";

        ApiResponse response = helper.http()
            .header(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON)
            .url(url)
            .sendGet();

        return response;
    }

}