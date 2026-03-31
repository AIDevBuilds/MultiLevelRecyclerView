package com.sandeepsingh.multilevelrecyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

public abstract class BaseRowViewHolder<T> extends BaseViewHolder<T> {

    public BaseRowViewHolder(View itemView) {
        super(itemView);
    }

    public void addRecyclerView(Context context){
        RecyclerView recyclerView = new RecyclerView(context);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayout.VERTICAL, false));
        recyclerView.setAdapter(onSubItemAdapter());

        ((LinearLayout)itemView).addView(recyclerView, 1);
    }

    public abstract GenericRecyclerViewAdapter onSubItemAdapter();
}
