package cn.vote.pojo;

import java.util.Date;

public class Huati {
    private Integer hid;

    private String hname;

    private String content;

    private Date starttime;

    private Date endtime;

    private Integer uid;

    private Integer ucount;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUcount() {
        return ucount;
    }

    public void setUcount(Integer ucount) {
        this.ucount = ucount;
    }

    @Override
    public String toString() {
        return "Huati{" +
                "hid=" + hid +
                ", hname='" + hname + '\'' +
                ", content='" + content + '\'' +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", uid=" + uid +
                ", ucount=" + ucount +
                '}';
    }
}