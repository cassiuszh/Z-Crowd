package com.zwz.crowd.util;

public class ResultEntity <T>{
    public static final String SUCCESS = "SUCCESS";
    public static final String FAILED = "FAILED";

    private String Result;
    private String message;
    private T data;

    public ResultEntity(String result, String message, T data) {
        Result = result;
        this.message = message;
        this.data = data;
    }

    public static <E> ResultEntity<E> successWithOutData(){

        return new ResultEntity<E>(SUCCESS,null,null);
    }

    public static <E> ResultEntity<E> successWithData(E data){
        return new ResultEntity<E>(SUCCESS, null, data);
    }



    public static <Type> ResultEntity<Type> failed(String message) {
        return new ResultEntity<Type>(FAILED, message, null);
    }

    public ResultEntity() {

    }







    @Override
    public String toString() {
        return "ResultEntity [result=" + Result + ", message=" + message + ", data=" + data + "]";
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        this.Result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
