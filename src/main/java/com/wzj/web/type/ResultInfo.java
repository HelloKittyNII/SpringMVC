package com.wzj.web.type;

/**
 * @author wzj
 * @create 2018-07-14 20:31
 **/
public class ResultInfo<T>
{
    /**
     * 状态
     */
    private int status;

    /**
     * 错误消息
     */
    private String message;

    /**
     * 数据域
     */
    private T data;

    public ResultInfo()
    {
    }

    public ResultInfo(int status)
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

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
