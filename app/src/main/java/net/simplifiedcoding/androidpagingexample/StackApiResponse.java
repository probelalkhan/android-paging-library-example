package net.simplifiedcoding.androidpagingexample;

import java.util.List;

class Owner {
    private int reputation;
    private long user_id;
    private String user_type;
    private String profile_image;
    private String display_name;
    private String link;
}

class Item {
    private Owner owner;
    private boolean is_accepted;
    private int score;
    private long last_activity_date;
    private long creation_date;
    private long answer_id;
    private long question_id;
}

public class StackApiResponse {
    private List<Item> items;
    private boolean has_more;
    private int quota_max;
    private int quota_remaining;

    public StackApiResponse(List<Item> items, boolean has_more, int quota_max, int quota_remaining) {
        this.items = items;
        this.has_more = has_more;
        this.quota_max = quota_max;
        this.quota_remaining = quota_remaining;
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public int getQuota_max() {
        return quota_max;
    }

    public int getQuota_remaining() {
        return quota_remaining;
    }
}
