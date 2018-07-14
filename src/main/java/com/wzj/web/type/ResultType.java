package com.wzj.web.type;

/**
 * @author wzj
 * @create 2018-07-14 20:34
 **/
public enum ResultType
{
    /**
     * 响应成功
     */
    SUCCESS(0),

    /**
     * 失败状态
     */
    FAILURE(1);

    /**
     * 状态
     */
    private int status;

    ResultType(int status)
    {
        this.status = status;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }
}
