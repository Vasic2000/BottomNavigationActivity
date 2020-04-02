package jp.vasic2000.bottomna.ui.home2

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
import jp.vasic2000.bottomna.BNAActivity
import jp.vasic2000.bottomna.R

class Home2Fragment : Fragment() {

    private lateinit var homeViewModel: Home2ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(Home2ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home2, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        chkBNA(root)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    private fun chkBNA(root: View) {
        val chkBNA: Button = root.findViewById(R.id.chkBNA)
        chkBNA.setOnClickListener { view ->
            restartApp()
            activity?.finish()
        }
    }

    private fun restartApp() {
        val intent = Intent(activity, BNAActivity::class.java)
        startActivity(intent)
    }
}
