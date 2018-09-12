package scottfinkelstein.com.recycleit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Person> mPersonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPersonList = new ArrayList<Person>();
        mPersonList.add(new Person("Sonic the Hedgehog", "15 Years Old", R.mipmap.sonic));
        mPersonList.add(new Person("Mario", "45 Years Old", R.mipmap.mario));
        mPersonList.add(new Person("Ms. Pac Man", "25 Years Old", R.mipmap.ms_pac_man));
        mPersonList.add(new Person("QBert", "21 Years Old", R.mipmap.qbert));
        mPersonList.add(new Person("Link", "16 Years Old", R.mipmap.link));

        RecyclerView rv = (RecyclerView)findViewById(R.id.recyclerView);
        rv.hasFixedSize();
        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        PersonAdaptor adaptor = new PersonAdaptor(mPersonList);
        rv.setAdapter(adaptor);
    }
}
