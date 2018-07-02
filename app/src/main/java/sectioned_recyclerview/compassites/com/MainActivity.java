package sectioned_recyclerview.compassites.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    ArrayList<String> stringArrayList = new ArrayList<>();
    ArrayList<Integer> myViewTypeArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        loadData();
        loadViewTypeData();

        MyAdapter myAdapter = new MyAdapter();
        myAdapter.setAdapterData(myViewTypeArrayList, stringArrayList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }

    void loadViewTypeData()
    {
        for (int i=10; i<90 ; i++)
        {
            if (i  % 10 ==0)
                myViewTypeArrayList.add(MyViewType.TYPE_HEADER);
            else {
                    myViewTypeArrayList.add(MyViewType.TYPE_INDIVIDUAL_CONTENT);
            }
        }
    }

    void loadData()
    {
        for (int i=10; i<90 ; i++)
        {
            stringArrayList.add("Item " + i);
        }
    }
}
