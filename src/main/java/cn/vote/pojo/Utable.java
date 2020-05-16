package cn.vote.pojo;

public class Utable {
    private Integer id;

    private Integer uid;

    private Integer hid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    @Override
    public String toString() {
        return "Utable{" +
                "id=" + id +
                ", uid=" + uid +
                ", hid=" + hid +
                '}';
    }

    public Utable(Integer uid, Integer hid) {
        this.uid = uid;
        this.hid = hid;
    }

    public Utable() {
    }
}