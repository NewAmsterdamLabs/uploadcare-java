package com.uploadcare.data;

import java.net.URI;
import java.util.Date;

public class GroupData {

    public String id;
    public URI url;
    public Date datetimeCreated;
    public Date datetimeStored;
    public int filesCount;
    public URI cdnUrl;

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", url=" + url +
                ", datetimeCreated=" + datetimeCreated +
                ", datetimeStored=" + datetimeStored +
                ", filesCount=" + filesCount +
                ", cdnUrl=" + cdnUrl +
                '}';
    }
}