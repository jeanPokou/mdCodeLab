package com.slack.jeanpokou.mdcodelab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.support.v4.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.support.v4.viewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adding Toolbar to Main screen
        setSupportActionBar(toolbar)
        // Setting View Pager for each Tabs
        setupViewPager(viewpager)

        // Adding Tabs
        with(tabs) {
            addTab(tabs.newTab().setText("List"))
            addTab(tabs.newTab().setText("Tile"))
            addTab(tabs.newTab().setText("Card"))
            setupViewPager(viewpager)
        }




    }



    // Add Fragments to Tabs
    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = Adapter(supportFragmentManager).apply {
            addFragment(ListContentFragment(), "List")
            addFragment(TileContentFragment(), "Tile")
            addFragment(CardContentFragment(), "Card")
        }
        viewPager.adapter = adapter

    }

    class Adapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

        private val mFragmentList = ArrayList<Fragment>()
        private val mFragmentTitleList = ArrayList<String>()


        fun addFragment(fragment: Fragment, title: String) {
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)

        }

        /**
         * Return the Fragment associated with a specified position.
         */
        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }

        /**
         * Return the number of views available.
         */
        override fun getCount(): Int {
            return mFragmentList.size
        }


    }


}
