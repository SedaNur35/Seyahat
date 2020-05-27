package com.example.seyahat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class FeedRecyclerAdapter extends RecyclerView.Adapter<FeedRecyclerAdapter.PostHolder> implements View.OnClickListener {
    private ArrayList<String> userEmailList;
    private ArrayList<String> userCommentList;

    private ArrayList<String> userImageList;
    private ArrayList<String> userMapList;
    private View.OnClickListener onClickListener;


    public FeedRecyclerAdapter(ArrayList<String> userEmailList, ArrayList<String> userCommentList, ArrayList<String> userImageList, ArrayList<String> userMapList) {


        this.userEmailList = userEmailList;
        this.userCommentList = userCommentList;
        this.userImageList = userImageList;
        this.userMapList = userMapList;


    }


    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.reycler_row, parent, false);






        return new PostHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostHolder holder, final int position) {
        holder.userEmailText.setText(userEmailList.get(position));
        holder.commentText.setText(userCommentList.get(position));
        holder.konumText.setText(userMapList.get(position));
        Picasso.get().load(userImageList.get(position)).into(holder.imageView);

    }


    @Override
    public int getItemCount() {


        return userEmailList.size();

    }

    @Override
    public void onClick(View v) {


    }


    class PostHolder extends RecyclerView.ViewHolder {


        ImageView imageView;
        TextView userEmailText;
        TextView commentText;
        TextView konumText;

        private PostHolder(@NonNull final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView2);
            userEmailText = itemView.findViewById(R.id.textView);
            commentText = itemView.findViewById(R.id.textView2);
            konumText = itemView.findViewById(R.id.textView3);



        }


    }
}