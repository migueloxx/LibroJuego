package es.santosgarcia.caperucita_santos.story;

/**
 * Created by Miguel & Santos on 06/12/2015.
 *
 */

//  @ Bookpage  This method creates us all the structure of the page
public class BookPage {
    private int imageId;
    private int titleId;
    private int descriptionId;
    private int optionAId;
    private int optionBid;
    private int optionANext;
    private int optionBNext;
    private int videoId;

    public BookPage(int imageId,
             int titleId,
             int descriptionId,
             int optionAId,
             int optionBid,
             int optionANext,
             int optionBNext) {
        this.imageId = imageId;
        this.titleId = titleId;
        this.descriptionId = descriptionId;
        this.optionAId = optionAId;
        this.optionBid = optionBid;
        this.optionANext = optionANext;
        this.optionBNext = optionBNext;
    }

    public BookPage(int optionANext,
                    int optionBNext) {
        this.optionANext = optionANext;
        this.optionBNext = optionBNext;
    }

    public BookPage(int videoId) {
        this.videoId = videoId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public int getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
    }

    public int getOptionAId() {
        return optionAId;
    }

    public void setOptionAId(int optionAId) {
        this.optionAId = optionAId;
    }

    public int getOptionBid() {
        return optionBid;
    }

    public void setOptionBid(int optionBid) {
        this.optionBid = optionBid;
    }

    public int getOptionANext() {
        return optionANext;
    }

    public void setOptionANext(int optionANext) {
        this.optionANext = optionANext;
    }

    public int getOptionBNext() {
        return optionBNext;
    }

    public void setOptionBNext(int optionBNext) {
        this.optionBNext = optionBNext;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
}
