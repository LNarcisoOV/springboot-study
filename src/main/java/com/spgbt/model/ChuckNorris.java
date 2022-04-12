package com.spgbt.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChuckNorris {

    @JsonProperty("icon_url")
    private String iconUrl;

    @JsonProperty("icon_url")
    private String id;

    @JsonProperty("icon_url")
    private String url;

    @JsonProperty("icon_url")
    private String value;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
