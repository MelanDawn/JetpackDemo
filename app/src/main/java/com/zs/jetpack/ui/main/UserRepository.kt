package com.zs.jetpack.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData

class UserRepository {

//    private val webservice: Webservice = TODO()

    fun getUser(userId: String): LiveData<User> {
        // This isn't an optimal implementation. We'll fix it later.
        val data = MutableLiveData<User>()
//        webservice.getUser(userId).enqueue(object : Callback<User> {
//            override fun onResponse(call: Call<User>, response: Response<User>) {
//                data.value = response.body()
//            }
//            // Error case is left out for brevity.
//            override fun onFailure(call: Call<User>, t: Throwable) {
//                TODO()
//            }
//        })
        data.value = User()
        return data
    }
}
//
//class Webservice {
//    fun getUser(userId: String): User {
//        return User()
//    }
//}