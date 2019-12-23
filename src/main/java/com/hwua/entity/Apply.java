package com.hwua.entity;

// 在线申请表
public class Apply {
    private Integer id;
    private String name;             // 姓名
    private String mobile;           // 手机
    private Integer qq;              // qq
    private String trademarK_name;   // 商标名字
    private Integer items_applicatio;// 申请事项
    private String file_path;        // 文件
    private String applyfor_date;    // 申请时间

    public Apply() {
    }

    public Apply(Integer id, String name, String mobile, Integer qq, String trademarK_name, Integer items_applicatio, String file_path, String applyfor_date) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.qq = qq;
        this.trademarK_name = trademarK_name;
        this.items_applicatio = items_applicatio;
        this.file_path = file_path;
        this.applyfor_date = applyfor_date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public void setTrademarK_name(String trademarK_name) {
        this.trademarK_name = trademarK_name;
    }

    public void setItems_applicatio(Integer items_applicatio) {
        this.items_applicatio = items_applicatio;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public void setApplyfor_date(String applyfor_date) {
        this.applyfor_date = applyfor_date;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public Integer getQq() {
        return qq;
    }

    public String getTrademarK_name() {
        return trademarK_name;
    }

    public Integer getItems_applicatio() {
        return items_applicatio;
    }

    public String getFile_path() {
        return file_path;
    }

    public String getApplyfor_date() {
        return applyfor_date;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", qq=" + qq +
                ", trademarK_name='" + trademarK_name + '\'' +
                ", items_applicatio=" + items_applicatio +
                ", file_path='" + file_path + '\'' +
                ", applyfor_date='" + applyfor_date + '\'' +
                '}';
    }
}
