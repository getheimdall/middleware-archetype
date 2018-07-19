package ${groupId};

import br.com.conductor.heimdall.middleware.spec.ApiResponse;
import br.com.conductor.heimdall.middleware.spec.Helper;
import br.com.conductor.heimdall.middleware.spec.Middleware;

import ${groupId}.service.CallService;
import ${groupId}.service.SimpleService;

public class MiddlewareExampleGET implements Middleware {

	private SimpleService simpleService;

	private CallService callService;

	private void initServices(Helper helper) {
		this.simpleService = new SimpleService(helper);
		this.callService = new CallService(helper);
	}

	public void run(Helper helper) {

		initServices(helper);

		ApiResponse response = simpleService.method();
        callService.response(response.getBody(), response.getStatus());

	}

}
