package com.example.code.gailsenterprise;


import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String mEmail;
    private String mPass;

    public User(String Email, String Pass) {
        this.mEmail = Email;
        this.mPass= Pass;

    }

    public String getmEmail() {
        return mEmail;
    }

    public String getmPass() {
        return mPass;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public void setmPass(String mPass) {
        this.mPass = mPass;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mEmail);
        dest.writeString(this.mPass);
    }

    protected User(Parcel in) {
        this.mEmail = in.readString();
        this.mPass = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
