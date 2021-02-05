package cz.vasic2000.photoBoxApp.ui.moscow_snowfall2018

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.vasic2000.bottomna.R

class Moscow_SnowFall_2018 : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_snowfall_2018, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)

        val layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager
        val data = DataFall()
        val myAdapter = SnowFallAdapter(data.getDataList())
        recyclerView.adapter = myAdapter
        return view
    }
}
