package jp.vasic2000.bottomna.ui.trains

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import jp.vasic2000.bottomna.R

class TrainAdapter(var dataList: List<String>?) : RecyclerView.Adapter<TrainAdapter.MyViewHolder>() {
    private var list: List<String>? = dataList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_card2, parent, false)
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
                0 -> imageView.setImageResource(R.drawable.train1)
                1 -> imageView.setImageResource(R.drawable.train2)
                2 -> imageView.setImageResource(R.drawable.train3)
                3 -> imageView.setImageResource(R.drawable.train4)
                4 -> imageView.setImageResource(R.drawable.train5)
                5 -> imageView.setImageResource(R.drawable.train6)
                6 -> imageView.setImageResource(R.drawable.train7)
                7 -> imageView.setImageResource(R.drawable.train8)
                8 -> imageView.setImageResource(R.drawable.train9)
            }
        }
    }
}