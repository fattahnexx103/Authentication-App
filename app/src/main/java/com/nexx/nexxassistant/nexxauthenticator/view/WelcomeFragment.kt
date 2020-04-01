package com.nexx.nexxassistant.nexxauthenticator.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController

import com.nexx.nexxassistant.nexxauthenticator.R
import kotlinx.android.synthetic.main.fragment_welcome.*

/**
 * A simple [Fragment] subclass.
 */
class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val navigation = Navigation.findNavController(view) // get the navigation object

        //click on sign up button
        welcome_signupBtn.setOnClickListener {
            navigation.navigate(R.id.action_welcomeFragment_to_signUpFragment)
        }

        //click on login button
        welcome_loginBtn.setOnClickListener {
            navigation.navigate(R.id.action_welcomeFragment_to_loginFragment)
        }

        //click on continue as guest
        welcome_guestBuyer.setOnClickListener {
            navigation.navigate(R.id.action_welcomeFragment_to_homeFragment);
        }

    }


}
