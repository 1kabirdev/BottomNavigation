package com.bottomnavigation.fragment.explore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.bottomnavigation.R

class ExploreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnNextFragment = view.findViewById<AppCompatButton>(R.id.btnNextFragment)

        /**
         * transition from fragment ExploreFragment on the ExploreDetailsFragment
         */
        btnNextFragment.setOnClickListener {
            findNavController().navigate(R.id.action_exploreFragment_to_exploreDetailsFragment)
        }
    }

}