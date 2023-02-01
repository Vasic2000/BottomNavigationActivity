package jp.vasic2000.bottomna.ui.pandemic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import jp.vasic2000.bottomna.R
import jp.vasic2000.bottomna.ui.trains.TrainAdapter

class PandemicAdapter(var dataList: List<String>?) : RecyclerView.Adapter<PandemicAdapter.MyViewHolder>() {
    private var list: List<String>? = dataList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PandemicAdapter.MyViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_card2, parent, false)
        return PandemicAdapter.MyViewHolder(view, list)
    }

    override fun onBindViewHolder(myViewHolder: PandemicAdapter.MyViewHolder, position: Int) {
        myViewHolder.bind(position)
    }

    override fun getItemCount(): Int {
        return list!!.size
    }

    class MyViewHolder(itemView: View, var dataList: List<String>?) :
        RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.image_view)
        fun bind(position: Int) {
            when (position) {
                0 -> imageView.setImageResource(R.drawable.covid1)
                1 -> imageView.setImageResource(R.drawable.covid2)
                2 -> imageView.setImageResource(R.drawable.covid3)
                3 -> imageView.setImageResource(R.drawable.covid4)
            }
        }
    }
}