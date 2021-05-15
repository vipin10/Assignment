package com.vipin.framework.mvvm.data.api

import com.vipin.framework.mvvm.data.model.TaskList
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single

class ApiServiceImpl : ApiService {
   /* override fun getUsers(): Single<List<User>> {
        TODO("Not yet implemented")
    }*/

    override fun getTasks(): Single<List<TaskList>> {
        return Rx2AndroidNetworking.get("https://demo1354773.mockable.io/deliveries")
            .build()
            .getObjectListSingle(TaskList::class.java)
    }

}