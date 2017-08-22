package works.domain.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class VHActivity extends AppCompatActivity {


    private List<String> itemList = new ArrayList<String>();
    private ListView itemLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityvh);
        itemLV = (ListView) findViewById(R.id.lv_viewHolder);

        populateList();

        Adapter adapter = new Adapter(VHActivity.this, R.layout.itemvh, itemList);
        itemLV.setAdapter(adapter);

    }

    public void populateList(){
        for(int i = 0; i < 5000; i ++ ) {
            itemList.add(" -- Item # --> " + (i + 1));
        }
    }

}