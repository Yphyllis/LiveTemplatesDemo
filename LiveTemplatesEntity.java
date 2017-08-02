package com.demo.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Created by yanghe on 2017/8/2.
 * <p>
 * com.demo.lifecycle
 */

public class LiveTemplatesEntity implements Parcelable {

    public LiveTemplatesEntity() {
    }

    protected LiveTemplatesEntity(Parcel in) {
        int intArray[] = in.createIntArray();
        in.readIntArray(intArray);  // UnparcelIntArray

        String stringArray[] = in.createStringArray();
        in.readStringArray(stringArray);  // UnparcelStringArray

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {

    }

    public static final Creator<LiveTemplatesEntity> CREATOR = new Creator<LiveTemplatesEntity>() {
        @Override
        public LiveTemplatesEntity createFromParcel(Parcel in) {
            return new LiveTemplatesEntity(in);
        }

        @Override
        public LiveTemplatesEntity[] newArray(int size) {
            return new LiveTemplatesEntity[size];
        }
    };  // Parcelable

    // ParcelableEnum
    // ParcelableEnumTest


}
