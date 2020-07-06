package com.example.loginpage;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mEdition;
    private String mImageUrl;

    private String mKey;

    public Upload() {
        //empty constructor needed
    }

    public Upload(String name, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }
      /*  if (edition.trim().equals("")) {
            edition = "No Edition";
        }*/

        mName = name;
       // mEdition = edition;
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }
    public String getEdition() {
        return mEdition;
    }

    public void setName(String name) {
        mName = name;
    }
    public void setEdition(String edition) {
        mEdition = edition;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }
}
