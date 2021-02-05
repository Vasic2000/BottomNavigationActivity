package jp.vasic2000.bottomna.ui.home2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Home2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is TAB Fragment"
    }
    val text: LiveData<String> = _text
}