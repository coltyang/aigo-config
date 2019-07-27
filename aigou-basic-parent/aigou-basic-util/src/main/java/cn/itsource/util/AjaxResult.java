package cn.itsource.util;

public class AjaxResult {
    private boolean success = true;
    private String message = "操作成功!";
    private Integer errorCode;
    //返回到前台对象
    private Object resultObj;


    private AjaxResult(){}

    public  static AjaxResult me(){
        return new AjaxResult();
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }



    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }




}
