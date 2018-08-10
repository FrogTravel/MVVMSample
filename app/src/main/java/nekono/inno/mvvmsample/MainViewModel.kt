package nekono.inno.mvvmsample

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log

class MainViewModel: ViewModel(){
    val stroke = MutableLiveData<String>()
    val textField = stroke


     val _enableButton = MutableLiveData<Boolean>()
        get(){
            field.value = (stroke.value ?: "").length > 5
            Log.d("MVVMMV", field.value.toString())
            return field
        }

    val enableButton : LiveData<Boolean>
        get() = _enableButton



}