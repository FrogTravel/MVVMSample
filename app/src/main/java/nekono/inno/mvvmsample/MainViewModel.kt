package nekono.inno.mvvmsample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel: ViewModel(){
    val stroke = MutableLiveData<String>()

    val enableButton = MutableLiveData<Boolean>()
        get(){
            field.value = (stroke.value ?: "").length > 5
            return field
        }
}