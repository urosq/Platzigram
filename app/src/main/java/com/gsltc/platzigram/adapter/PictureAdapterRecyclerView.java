package com.gsltc.platzigram.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gsltc.platzigram.R;
import com.gsltc.platzigram.model.Picture;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder> {


    private ArrayList<Picture> pictures;
    private int resourse;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resourse = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resourse, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder pictureViewHolder, int position) {
        Picture picture = pictures.get(position);
        pictureViewHolder.usernameCard.setText(picture.getUserName());
        pictureViewHolder.timeCard.setText(picture.getTime());
        pictureViewHolder.likeNumberCard.setText(picture.getLike_number());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView usernameCard;
        private TextView timeCard;
        private TextView likeNumberCard;


        public PictureViewHolder(@NonNull View itemView) {
            super(itemView);

            pictureCard    =(ImageView) itemView.findViewById(R.id.pictureCard1);
            usernameCard   =(TextView) itemView.findViewById(R.id.userNameCard);
            timeCard       =(TextView) itemView.findViewById(R.id.timeCard);
            likeNumberCard =(TextView) itemView.findViewById(R.id.likeCheckCard);

        }
    }
}
