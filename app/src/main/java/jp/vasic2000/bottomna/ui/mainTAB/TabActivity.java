package jp.vasic2000.bottomna.ui.mainTAB;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import ru.leonidivankin.materialdesignlesson7.R;
import ru.leonidivankin.materialdesignlesson7.fragments.Fragment1;
import ru.leonidivankin.materialdesignlesson7.fragments.Fragment2;
import ru.leonidivankin.materialdesignlesson7.fragments.Fragment3;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Fragment fragment1 = Fragment1.newInstance(null);
        Fragment fragment2 = Fragment2.newInstance(null);
        Fragment fragment3 = Fragment3.newInstance(null);

        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter.addFragment(fragment1, "tab1");
        myAdapter.addFragment(fragment2, "tab2");
        myAdapter.addFragment(fragment3, "tab3");

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(myAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }
}