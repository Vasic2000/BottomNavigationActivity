package jp.vasic2000.bottomna

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import cz.vasic2000.photoBoxApp.ui.moscow_snowfall2018.Moscow_SnowFall_2018
import jp.vasic2000.bottomna.ui.home2.Home2Fragment
import jp.vasic2000.bottomna.ui.mainTAB.MyAdapter
import jp.vasic2000.bottomna.ui.pandemic.PandemicFragment
import jp.vasic2000.bottomna.ui.trains.TrainFragment

class TABActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)
        val fragment1: Fragment = Home2Fragment()
        val fragment2: Fragment = PandemicFragment()
        val fragment3: Fragment = Moscow_SnowFall_2018()
        val fragment4: Fragment = TrainFragment()
        val myAdapter = MyAdapter(supportFragmentManager)
        myAdapter.addFragment(fragment1, "Home")
        myAdapter.addFragment(fragment2, "Pandemic")
        myAdapter.addFragment(fragment3, "SnowFall")
        myAdapter.addFragment(fragment4, "Trains")
        val viewPager = findViewById<ViewPager>(R.id.view_pager)
        viewPager.adapter = myAdapter
        val tabs = findViewById<TabLayout>(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
    }
}