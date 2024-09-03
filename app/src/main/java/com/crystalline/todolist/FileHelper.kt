package com.crystalline.todolist

import android.content.Context
import java.io.FileOutputStream
import java.io.ObjectOutputStream

class FileHelper {
    var FILENAME = "listinfo.dat"

    fun writeData(item : ArrayList<String>, context : Context) {
        var fos : FileOutputStream = context.openFileOutput(FILENAME, Context.MODE_PRIVATE);

        var oas = ObjectOutputStream(fos)
        oas.writeObject(item)
        oas.close()
    }
}