package com.example.icetask1
import android.widget.TextView
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.jupiter.api.Assertions.*
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

class MainActivityTest1 {
    @Test
    fun testButtonClick(){
        val mainActivity = MainActivity()

        val textView = TextView(mainActivity)

        mainActivity.textView = textView

        mainActivity.onClick(mock(View::class.java))

        assertEquals("你好，世界！", textView.text.toString())
    }
}


