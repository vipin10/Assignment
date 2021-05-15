package com.vipin.framework.mvvm.data.repository

import com.vipin.framework.mvvm.data.api.ApiHelper
import com.vipin.framework.mvvm.data.model.TaskList
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

   /* fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }*/

    fun getTasks(): Single<List<TaskList>> {
        return apiHelper.getTasks()
    }

}