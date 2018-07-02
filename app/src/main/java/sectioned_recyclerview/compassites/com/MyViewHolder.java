package sectioned_recyclerview.compassites.com;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;


public class MyViewHolder extends ViewHolder {

    TextView contentTextView, headerTextView;

    public MyViewHolder(View itemView) {
        super(itemView);

        contentTextView = itemView.findViewById(R.id.content_text_view);
        headerTextView = itemView.findViewById(R.id.header_text_view);

    }
}
