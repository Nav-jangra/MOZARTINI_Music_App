package com.internshala.MOZARTini.Fragments

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.internshala.MOZARTini.R

/**
 * A simple [Fragment] subclass.
 *
 */
class AboutUsFragment : Fragment() {

    var detailsText: TextView? = null
    var appVersion: TextView? = null
    var devEmail: TextView? = null
    var myActivity: Activity? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.title = "About Us"
        if (container != null) {
            container.removeAllViews()
        }
        val view = inflater.inflate(R.layout.fragment_about_us, container, false)



        devEmail = view?.findViewById(R.id.devEmail)
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        myActivity = context as Activity
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        myActivity = activity
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)



        devEmail?.setText("TO the great music composer Mozart")
    }

    override fun onPrepareOptionsMenu(menu: Menu?) {
        super.onPrepareOptionsMenu(menu)
        val item = menu?.findItem(R.id.action_sort)
        item?.isVisible = false
    }
}
