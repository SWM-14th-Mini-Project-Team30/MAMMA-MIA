package org.swm.mammamia.ui.recommend

import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayoutMediator
import org.swm.mammamia.R
import org.swm.mammamia.databinding.FragmentRecommendBinding
import org.swm.mammamia.ui.base.BaseFragment


class RecommendFragment : BaseFragment<FragmentRecommendBinding>(R.layout.fragment_recommend) {
    private lateinit var gitTabHostVPAdapter: RecommendAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.lifecycleOwner = this
        initAdapter()
        setViewPagerFragment()
        initTabLayout()
    }

    private fun initAdapter() {
        binding.vpHome.adapter =
            RecommendAdapter(this).also { gitTabHostVPAdapter = it }
    }

    private fun setViewPagerFragment() {
        gitTabHostVPAdapter.fragmentList = listOf(DataBaseFragment(), LocationBaseFragment())
    }

    private fun initTabLayout() {
        val tabLabel = listOf(
            getString(R.string.data_base_recommendation),
            getString(R.string.location_base_recommendation)
        )
        TabLayoutMediator(binding.tlHome, binding.vpHome) { tab, position ->
            tab.text = tabLabel[position]
        }.attach()
    }
}
