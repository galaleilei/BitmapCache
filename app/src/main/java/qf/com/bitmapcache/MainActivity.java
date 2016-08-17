package qf.com.bitmapcache;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv= (ListView) findViewById(R.id.lv);
        List<String> data=new ArrayList<>();
        for (int i = 0; i <40 ; i++) {
            data.add(i+">>");
        }
        MyAdapter adapter=new MyAdapter(this,data);
        lv.setAdapter(adapter);
        String abc="http://10.36.137.42:8080/androidoo/q";
        String a="ccd11";
        String x="ccd12";
        Log.e("TAG", "abc"+StringUtils.getMD5Str32byte(abc) );
        Log.e("TAG", "abc"+StringUtils.getMD5Str32byte(abc) );
        Log.e("TAG", "a"+StringUtils.getMD5Str32byte(a) );
        Log.e("TAG", "x"+StringUtils.getMD5Str32byte(x) );

    }
}
