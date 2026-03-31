package com.sandeepsingh.multilevelrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiLevelRecyclerViewAdapter<T extends BaseModal, VH extends BaseViewHolder<T>> extends GenericRecyclerViewAdapter<T, VH> {

    private List<T> items;
    private LayoutInflater layoutInflater;
    private Context context;

    public abstract VH onCreateSectionViewHolder(ViewGroup parent);
    public abstract VH onCreateRowViewHolder(ViewGroup parent, Context context);


    public MultiLevelRecyclerViewAdapter(Context context) {
        super(context);
        layoutInflater = LayoutInflater.from(context);
        items = new ArrayList<>();
        this.context = context;
    }

    @Override
    public  VH onCreateViewHolder(ViewGroup parent, int viewType){

        if(viewType == 0){
            return onCreateSectionViewHolder(parent);
        }
        else{
            return onCreateRowViewHolder(parent, context);
        }
    }


    @Override
    public int getItemViewType(int position) {
        super.getItemViewType(position);

        if(getItem(position).isRow()) {
            return 1;
        } else {
            return 0;
        }
    }
}