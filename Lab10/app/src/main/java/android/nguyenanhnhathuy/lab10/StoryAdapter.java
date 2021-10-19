package android.nguyenanhnhathuy.lab10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryHolder> {
    private final ArrayList<StoryEntity> listStory;
    private final Context mContext;

    public StoryAdapter(ArrayList<StoryEntity> listStory, Context mContext) {
        this.listStory = listStory;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public StoryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_story, viewGroup, false);
        return new StoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.StoryHolder storyHolder, int i) {
        StoryEntity item = listStory.get(i);

        storyHolder.tvName.setTag(item);
        storyHolder.tvName.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return listStory.size();
    }

    public class StoryHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        public StoryHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_story);
            itemView.setOnClickListener(view -> {((MainActivity)mContext).gotoM003Screen(listStory,
                    (StoryEntity)tvName.getTag());});
        }
    }
}
