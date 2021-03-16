package com.example.spictures.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.spictures.R
import com.example.spictures.fragments.FavoriteFragment
import com.example.spictures.fragments.HomeFragment
import com.example.spictures.fragments.SettingFragment
import com.example.spictures.fragments.StartFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, StartFragment())
            .commit()

        val homeFragment = HomeFragment()
        val settingFragment = SettingFragment()
        val favoriteFragment = FavoriteFragment()




        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_favorite -> makeCurrentFragment(favoriteFragment)
                R.id.ic_settings -> makeCurrentFragment(settingFragment )

            }
            true
        }
    }
    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer,fragment)
            commit()
        }

    }
}