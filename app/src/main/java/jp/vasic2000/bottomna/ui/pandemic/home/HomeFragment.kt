package jp.vasic2000.bottomna.ui.pandemic.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import jp.vasic2000.bottomna.R
import jp.vasic2000.bottomna.TABActivity

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        chkTAB(root)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    private fun chkTAB(root: View) {
        val chkTAB: Button = root.findViewById(R.id.chkTAB)
        chkTAB.setOnClickListener { view ->
            restartApp()
            activity?.finish()
        }
    }

    private fun restartApp() {
        val intent = Intent(activity, TABActivity::class.java)
        startActivity(intent)
    }
}
