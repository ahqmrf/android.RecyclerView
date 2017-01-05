package ahqmrf.recyclerview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ahqmrf.recyclerview.R;
import ahqmrf.recyclerview.adapter.MyAdapter;
import ahqmrf.recyclerview.model.Data;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = (RecyclerView) findViewById(R.id.rec_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyAdapter(Data.getListData(), this);
        recyclerView.setAdapter(adapter);
    }
}
