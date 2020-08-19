package com.oyokungroup.myjournal;

import java.io.Serializable;

public class MyJournal implements Serializable {
    private String id;
    private String title;
    private String description;
    private String imageUrl;
    private String imageName;

    public MyJournal(){}

    public MyJournal(String title, String description, String imageUrl, String imageName) {
        this.setId(id);
        this.setTitle(title);
        this.setDescription(description);
        this.setImageUrl(imageUrl);
        this.setImageName(imageName);

    }

     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
