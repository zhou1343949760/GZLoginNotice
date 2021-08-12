package com.hzgzsoft.gz_login_notice;

/**
 * Retrofit
 * @author Shadow
 */
public class LoginMessage {
    String Id;
    String Title;
    String ReleaseTime;
    String Publisher;
    String Source;
    String Information;
    String Clicks;
    String State;
    String InsertTime;
    String InsertName;
    String IsOpen;

    /**
     * 定义 输出返回数据 的方法
     */
    public void show() {
        System.out.println(Id);
        System.out.println(Title);
        System.out.println(ReleaseTime);
        System.out.println(Publisher);
        System.out.println(Source);
        System.out.println(Information);
        System.out.println(Clicks);
        System.out.println(State);
        System.out.println(InsertTime);
        System.out.println(InsertName);
        System.out.println(IsOpen);
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getReleaseTime() {
        return ReleaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        ReleaseTime = releaseTime;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public String getClicks() {
        return Clicks;
    }

    public void setClicks(String clicks) {
        Clicks = clicks;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getInsertTime() {
        return InsertTime;
    }

    public void setInsertTime(String insertTime) {
        InsertTime = insertTime;
    }

    public String getInsertName() {
        return InsertName;
    }

    public void setInsertName(String insertName) {
        InsertName = insertName;
    }

    public String getIsOpen() {
        return IsOpen;
    }

    public void setIsOpen(String isOpen) {
        IsOpen = isOpen;
    }
}
