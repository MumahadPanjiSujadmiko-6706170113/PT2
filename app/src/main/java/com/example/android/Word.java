package com.example.android.miwok;

public class Word {
    private String miwokWord;
    private int imageResId = -1; //karena tidak ada resource yang nilainya -1

    public Word(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public Word(String miwokWord, int imageResId) {
        this.miwokWord = miwokWord;
        this.imageResId = imageResId;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public boolean hasImage(){
        return imageResId!=-1;
    }

    public int getImageResId() {
        return imageResId;
    }
}
