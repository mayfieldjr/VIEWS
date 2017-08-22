package works.domain.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NVHActivity extends AppCompatActivity {

    private ListView itemLV;
    private ArrayList<String> itemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitynvh);

        itemLV = (ListView) findViewById(R.id.lv_noViewHolder);
        itemList = new ArrayList();
        populateList();

        ListAdapter adapter = new ArrayAdapter< String >(
                NVHActivity.this,
                R.layout.itemnvh,
                itemList);

        itemLV.setAdapter(adapter);

    }

    public void populateList(){
        for(int i = 0; i < 5000; i ++ ) {
            itemList.add(" -- Item # --> " + (i + 1));
        }
    }
}