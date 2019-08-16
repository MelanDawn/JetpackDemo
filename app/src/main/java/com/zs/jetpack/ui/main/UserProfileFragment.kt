package com.zs.jetpack.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.SavedStateHandle
import com.zs.jetpack.R

class UserProfileFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: UserProfileViewModel = UserProfileViewModel(SavedStateHandle())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.user_profile_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.user.observe(viewLifecycleOwner, Observer<User>() {
            fun onChanged(user: LiveData<User>) {
                Log.d(this.toString(), user.value.toString())
            }
        })
    }

}