package net.tecgurus.mobilepos.controllers.request;

import com.google.gson.Gson;

import net.tecgurus.mobilepos.models.request.LoginRequestModel;

public class LoguinRequest extends Request {
    public void setOnResult(OnResult onResult) {
        this.onResult = onResult;
    }

    private OnResult onResult;
    private LoginRequestModel loginRequestModel;

    public void setLoginRequestModel(LoginRequestModel loginRequestModel) {
        this.loginRequestModel = loginRequestModel;
    }

    protected void OnResult(String result) {

        final Gson gson=new Gson();
        final LoginRequestModel loginRequestModel =gson.fromJson(result,LoginRequestModel.class);
        if(loginRequestModel.isResult()){
            if(onResult!=null){
                onResult.onLoginSuccess();
            }
        }
    }

    @Override
    protected void onResult(String result) {

          if(onResult!=null){
              onResult.onLoginSuccess();
          }
    }

    @Override
    public void execute() throws Exception{
        final Gson gson=new Gson();
        final  String json= gson.toJson(this.loginRequestModel);

       // final String result=this.requestManager.post("http://localhost:8080/jdeventas/Login",json);
        final String result=this.requestManager.post("http://192.168.100.77:8080/jdeventas/Login",json);

        this.onResult(result);

    }
    public interface OnResult{

        void onLoginSuccess();
        void onInvalidLoin();
    }

}
