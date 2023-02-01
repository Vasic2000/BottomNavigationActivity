package jp.vasic2000.bottomna.ui.pandemic.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is BNA Fragment"
    }
    val text: LiveData<String> = _text
}