package com.vipin.framework.mvvm.data.api

import com.vipin.framework.mvvm.data.model.TaskList
import io.reactivex.Single

interface ApiService {

//   / fun getUsers(): Single<List<User>>

    fun getTasks(): Single<List<TaskList>>


}