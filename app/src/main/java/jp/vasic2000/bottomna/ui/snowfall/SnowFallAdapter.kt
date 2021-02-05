package cz.vasic2000.photoBoxApp.ui.moscow_snowfall2018

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import jp.vasic2000.bottomna.R

class SnowFallAdapter(var dataList: List<String>?) : RecyclerView.Adapter<SnowFallAdapter.MyViewHolder>() {
    private var list: List<String>? = dataList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return MyViewHolder(view, list)
    }

    override fun onBindViewHolder(myViewHolder: MyViewHolder, position: Int) {
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
                0 -> imageView.setImageResource(R.drawable.winter1)
                1 -> imageView.setImageResource(R.drawable.winter2)
                2 -> imageView.setImageResource(R.drawable.winter3)
                3 -> imageView.setImageResource(R.drawable.winter4)
                4 -> imageView.setImageResource(R.drawable.winter5)
                5 -> imageView.setImageResource(R.drawable.winter6)
                6 -> imageView.setImageResource(R.drawable.winter7)
                7 -> imageView.setImageResource(R.drawable.winter8)
                8 -> imageView.setImageResource(R.drawable.winter9)
                9 -> imageView.setImageResource(R.drawable.winter10)
            }
        }
    }
}