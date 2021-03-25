package com.fastoffer.backend.dtos;

public class ResponseResults {
    //status 200 成功， 400、500失败
    private int status;
    private Object data;
    private String msg;

    public static ResponseResults ok(){
        ResponseResults responseResults = new ResponseResults();
        responseResults.setStatus(200);
        responseResults.setMsg("ok");
        return responseResults;
    }

    public static ResponseResults ok(Object data){
        ResponseResults responseResults = new ResponseResults();
        responseResults.setData(data);
        responseResults.setStatus(200);
        responseResults.setMsg("ok");
        return responseResults;
    }
    public static ResponseResults ok(String msg){
        ResponseResults responseResults = new ResponseResults();
        responseResults.setStatus(200);
        responseResults.setMsg(msg);
        return responseResults;
    }

    public static ResponseResults error(String msg){
        ResponseResults responseResults = new ResponseResults();
        responseResults.setStatus(400);
        responseResults.setMsg(msg);
        return responseResults;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
