package cn.com.wl.utils;

/**
 * @author Mr.Wang
 */
public class AjaxResult {
    private boolean success;
    private String msg;

    public AjaxResult(String msg) {
        this.success = true;
        this.msg = msg;
    }

    public AjaxResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
