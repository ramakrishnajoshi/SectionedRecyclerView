package sectioned_recyclerview.compassites.com;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    ArrayList<String> stringArrayList;
    ArrayList<Integer> myViewTypeArrayList;

    /*void setAdapterData(ArrayList<String> stringArrayList)
    {
        this.stringArrayList = stringArrayList;
    }*/

    void setAdapterData(ArrayList<Integer> myViewTypeArrayList, ArrayList<String> stringArrayList)
    {
        this.stringArrayList = stringArrayList;
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

        if (getItemViewType(position) == MyViewType.TYPE_HEADER)
            holder.headerTextView.setText("" +  stringArrayList.get(position));
        else if (getItemViewType(position) == MyViewType.TYPE_INDIVIDUAL_CONTENT)
            holder.contentTextView.setText("" + stringArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringArrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return myViewTypeArrayList.get(position);
    }
}
