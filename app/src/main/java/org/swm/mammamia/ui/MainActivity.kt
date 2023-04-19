package org.swm.mammamia.ui

import android.os.Bundle
import org.swm.mammamia.R
import org.swm.mammamia.databinding.ActivityMainBinding
import org.swm.mammamia.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}