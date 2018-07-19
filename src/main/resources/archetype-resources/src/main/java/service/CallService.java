package ${groupId}.service;

import br.com.conductor.heimdall.middleware.spec.Helper;
import ${groupId}.util.Constants;

public class CallService {

    private Helper helper;

    public CallService(Helper helper) {

        this.helper = helper;
    }

    public <T> void response(T body) {

        helper.call().response().header().add(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON);
        helper.call().response().setBody(helper.json().parse(body));
    }

    public void response(String body) {

        helper.call().response().header().add(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON);
        helper.call().response().setBody(helper.json().parse(body));
    }

    public void response(String body, Integer statusCode) {

        response(body);
        helper.call().response().setStatus(statusCode);
    }

    public <T> void response(T body, Integer statusCode) {

        response(body);
        helper.call().response().setStatus(statusCode);
    }

}
