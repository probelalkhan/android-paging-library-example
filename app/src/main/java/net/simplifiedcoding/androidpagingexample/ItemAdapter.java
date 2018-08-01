package net.simplifiedcoding.androidpagingexample;

import android.arch.paging.PagedListAdapter;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.view.ViewGroup;

public class ItemAdapter extends PagedListAdapter<Item, ItemViewHolder> {


    protected ItemAdapter(@NonNull DiffUtil.ItemCallback<Item> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

    }
}
