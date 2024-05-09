package com.example.smartdermato

import android.graphics.Bitmap
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


class MainViewModel: ViewModel() {

    private val _bitmaps = MutableStateFlow<List<Bitmap>>(emptyList())
    val bitmaps = _bitmaps.asStateFlow()

    var showDialog by mutableStateOf(false)
    var resultText by mutableStateOf("")

    fun onTakePhoto(bitmap: Bitmap) {
        _bitmaps.value += bitmap
    }

    fun onPhotoClicked(bitmap: Bitmap){
        //sample code for testing
        resultText = "This is a test result for the chosen photo"
        showDialog = true
    }
    fun onDialogDismissed() {
        showDialog = false  // Set showDialog to false to hide the dialog
    }
}