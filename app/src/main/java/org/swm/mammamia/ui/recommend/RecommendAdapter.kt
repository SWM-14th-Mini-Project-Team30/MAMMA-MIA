package org.swm.mammamia.ui.recommend

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class RecommendAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {
    private val _fragmentList = mutableListOf<Fragment>()
    var fragmentList: List<Fragment> = _fragmentList
        set(value) {
            _fragmentList.addAll(value)
        }

    override fun getItemCount(): Int = _fragmentList.size
    override fun createFragment(position: Int): Fragment = _fragmentList[position]
}
