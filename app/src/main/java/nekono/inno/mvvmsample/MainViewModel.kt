package nekono.inno.mvvmsample

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel

class MainViewModel: ViewModel(){
    val stroke = MutableLiveData<String>()

    val enableButton: LiveData<Boolean> = Transformations.map(stroke) {  it.length > 5 }
}