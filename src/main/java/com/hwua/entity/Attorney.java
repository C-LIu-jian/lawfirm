package com.hwua.entity;

// 律师表
public class Attorney {
    private Integer id;
    private String  name;           // 姓名
    private String attorney_images; // 照片
    private String degree;          // 学位
    private String aptitude;        // 资质
    private String release_time;    // 发布时间
    private String experience;      // 个人经历

    public Attorney() {
    }

    public Attorney(Integer id, String name, String attorney_images, String degree, String aptitude, String release_time, String experience) {
        this.id = id;
        this.name = name;
        this.attorney_images = attorney_images;
        this.degree = degree;
        this.aptitude = aptitude;
        this.release_time = release_time;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Attorney{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attorney_images='" + attorney_images + '\'' +
                ", degree='" + degree + '\'' +
                ", aptitude='" + aptitude + '\'' +
                ", release_time='" + release_time + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttorney_images(String attorney_images) {
        this.attorney_images = attorney_images;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setAptitude(String aptitude) {
        this.aptitude = aptitude;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAttorney_images() {
        return attorney_images;
    }

    public String getDegree() {
        return degree;
    }

    public String getAptitude() {
        return aptitude;
    }

    public String getRelease_time() {
        return release_time;
    }

    public String getExperience() {
        return experience;
    }
}
