package com.hwua.entity;

// 新闻
public class News {
    private Integer id;
    private String classify;
    private String news_images;
    private String release_time;
    private Integer hits;
    private String content;
    private String text_name;
    private String name;

    public News() {
    }

    public News(Integer id, String text_name, String name) {
        this.id = id;
        this.text_name = text_name;
        this.name = name;
    }

    public News(Integer id, String classify, String news_images, String release_time, Integer hits, String content, String text_name, String name) {
        this.id = id;
        this.classify = classify;
        this.news_images = news_images;
        this.release_time = release_time;
        this.hits = hits;
        this.content = content;
        this.text_name = text_name;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassify() {
        return classify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getNews_images() {
        return news_images;
    }

    public void setNews_images(String news_images) {
        this.news_images = news_images;
    }

    public String getRelease_time() {
        return release_time;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getText_name() {
        return text_name;
    }

    public void setText_name(String text_name) {
        this.text_name = text_name;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", classify='" + classify + '\'' +
                ", news_images='" + news_images + '\'' +
                ", release_time='" + release_time + '\'' +
                ", hits=" + hits +
                ", content='" + content + '\'' +
                ", text_name='" + text_name + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
