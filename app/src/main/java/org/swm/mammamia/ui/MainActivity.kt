package org.swm.mammamia.ui

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import org.swm.mammamia.R
import org.swm.mammamia.databinding.ActivityMainBinding
import org.swm.mammamia.ui.adapter.MainViewPagerAdapter
import org.swm.mammamia.ui.base.BaseActivity
import org.swm.mammamia.ui.home.HomeFragment
import org.swm.mammamia.ui.profile.ProfileFragment
import org.swm.mammamia.ui.recommend.RecommendFragment

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private lateinit var mainViewPagerAdapter: MainViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAdapter()
        setViewPagerFragment()
        syncVpWithBottomNav()
    }

    private fun initAdapter() {
        binding.vpMain.adapter = MainViewPagerAdapter(this).also { mainViewPagerAdapter = it }
    }

    private fun setViewPagerFragment() {
        mainViewPagerAdapter.fragmentList =
            listOf(HomeFragment(), RecommendFragment(), ProfileFragment())
    }

    private fun syncVpWithBottomNav() {
        binding.vpMain.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                binding.bottomNav.menu.getItem(position).isChecked = true
            }
        })

        binding.bottomNav.setOnItemSelectedListener {
            val position = when (it.itemId) {
                R.id.menu_home -> 0
                R.id.menu_recommend -> 1
                R.id.menu_profile -> 2
                else -> return@setOnItemSelectedListener false
            }
            binding.vpMain.setCurrentItem(position, false)
            return@setOnItemSelectedListener true
        }
    }
}