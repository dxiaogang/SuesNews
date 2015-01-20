package com.example.lee.suesnews.bean;

/**
 * 新闻实体类
 * Created by Administrator on 2015/1/18.
 */
public class NewsItem {

    private int id;    //ID

    private int type;       //文章类型
    private String title;   //标题
    private String link;    //链接
    private String date;    //日期
    private String content; //文章内容

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NewsItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }



}
