package com.example.twitter

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.PopupMenu
import android.widget.Toast
import android.widget.Toolbar
import com.example.twitter.util.BASE_URL
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import dev.hotwire.turbo.fragments.TurboWebFragment
import dev.hotwire.turbo.nav.TurboNavGraphDestination

@TurboNavGraphDestination(uri = "turbo://fragment/web/home")
class HomeFragment : TurboWebFragment() {
    override fun createErrorView(statusCode: Int): View {
        return super.createErrorView(statusCode)
    }

//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        return inflater.inflate(R.layout.home, container, false)
//    }
//
//    override fun shouldObserveTitleChanges(): Boolean {
//        return false
//    }
}