package works.domain.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button viewHolderBTN;
    Button notViewHolderBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewHolderBTN = (Button) findViewById(R.id.btn_list_VH);
        notViewHolderBTN = (Button) findViewById(R.id.btn_list_NVH);
    }

    public void openListViewHolder(View view) {
        Intent intent = new Intent(MainActivity.this, VHActivity.class);
        startActivity(intent);
    }

    public void openListNotViewHolder(View view) {
        Intent intent = new Intent(MainActivity.this, NVHActivity.class);
        startActivity(intent);
    }
}