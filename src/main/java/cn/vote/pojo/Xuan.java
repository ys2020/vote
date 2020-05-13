package cn.vote.pojo;

public class Xuan {
    private Integer xid;

    private Integer hid;

    private String xname;

    private Integer xcount;

    private String xcontent;

    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname == null ? null : xname.trim();
    }

    public Integer getXcount() {
        return xcount;
    }

    public void setXcount(Integer xcount) {
        this.xcount = xcount;
    }

    public String getXcontent() {
        return xcontent;
    }

    public void setXcontent(String xcontent) {
        this.xcontent = xcontent == null ? null : xcontent.trim();
    }

    @Override
    public String toString() {
        return "Xuan{" +
                "xid=" + xid +
                ", hid=" + hid +
                ", xname='" + xname + '\'' +
                ", xcount=" + xcount +
                ", xcontent='" + xcontent + '\'' +
                '}';
    }

    public Xuan( Integer hid, String xname, Integer xcount, String xcontent) {
        this.hid = hid;
        this.xname = xname;
        this.xcount = xcount;
        this.xcontent = xcontent;
    }

    public Xuan() {
    }
}