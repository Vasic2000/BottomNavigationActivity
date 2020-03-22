package jp.vasic2000.bottomna.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Empty Fragment/nNo photo here..."
    }
    val text: LiveData<String> = _text
}