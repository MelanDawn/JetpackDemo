package com.zs.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zs.jetpack.ui.main.MainFragment
import com.zs.jetpack.ui.main.UserProfileFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, UserProfileFragment.newInstance())
                .commitNow()
        }
    }

}
