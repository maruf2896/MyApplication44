package com.example.myapplication44;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderViewHolder> {
    private Context context;
    private int[] images;

    public SliderAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item_layout, null);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
viewHolder.imageView.setImageResource(images[position]);

}

    @Override
    public int getCount() {
        return images.length;
    }

    public class SliderViewHolder extends SliderViewAdapter.ViewHolder {

        private ImageView imageView;

        public SliderViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.g1Id);

            itemView.setOnClickListener(view -> {
                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("imageId", images[getAdapterPosition()]);
                context.startActivity(intent);
            });
        }
    }
}