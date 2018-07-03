package sectioned_recyclerview.compassites.com;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import sectioned_recyclerview.compassites.com.ItemType.HeaderViewType;
import sectioned_recyclerview.compassites.com.ItemType.IndividualContentViewType;
import sectioned_recyclerview.compassites.com.ItemType.MyViewType;


public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    //ArrayList<String> stringArrayList;
    ArrayList<MyViewType> myViewTypeArrayList;

    /*void setAdapterData(ArrayList<String> stringArrayList)
    {
        this.stringArrayList = stringArrayList;
    }*/

    void setAdapterData(ArrayList<MyViewType> myViewTypeArrayList/*, ArrayList<String> stringArrayList*/)
    {
        //this.stringArrayList = stringArrayList;
        this.myViewTypeArrayList = myViewTypeArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == MyViewType.TYPE_HEADER) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_recycler_view_header, parent, false);
            return new MyViewHolder(v);
        }

        else if (viewType == MyViewType.TYPE_INDIVIDUAL_CONTENT) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_recycler_view_content, parent, false);
            return new MyViewHolder(v);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        if (getItemViewType(position) == MyViewType.TYPE_HEADER) {
            //holder.headerTextView.setText("" + stringArrayList.get(position));

            holder.headerTextView.setText("" + ((HeaderViewType)myViewTypeArrayList.get(position)).getHeaderName());
            /*MyViewType myViewType = myViewTypeArrayList.get(position);
            if (myViewType.getMyViewType() == MyViewType.TYPE_HEADER)
                holder.headerTextView.setText("" + myViewTypeArrayList.get(position));*/
        }
        else if (getItemViewType(position) == MyViewType.TYPE_INDIVIDUAL_CONTENT)
            /*holder.contentTextView.setText("" + stringArrayList.get(position));*/
            holder.contentTextView.setText("" + ((IndividualContentViewType)myViewTypeArrayList.get(position)).getIndividualContentString());
    }

    @Override
    public int getItemCount() {
        return myViewTypeArrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return myViewTypeArrayList.get(position).getMyViewType();
    }


    /*public class MyHeaderViewHolder extends RecyclerView.ViewHolder {

        TextView contentTextView, headerTextView;

        public MyHeaderViewHolder(View itemView) {
            super(itemView);

            headerTextView = itemView.findViewById(R.id.header_text_view);

        }
    }

    public class MyContentViewHolder extends RecyclerView.ViewHolder {

        TextView contentTextView, headerTextView;

        public MyContentViewHolder(View itemView) {
            super(itemView);

            contentTextView = itemView.findViewById(R.id.content_text_view);
        }
    }*/
}
