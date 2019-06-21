package com.example.android.youtubedonwland

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.commit451.youtubeextractor.YouTubeExtractor



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val extractor = YouTubeExtractor.Builder()
        val extraction = extractor.build().extract("9d8wWcJLnFI")


    }
}
