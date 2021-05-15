package com.vipin.framework.mvvm.data.api

class ApiHelper(private val apiService: ApiService) {

//    fun getUsers() = apiService.getUsers()

    fun getTasks() = apiService.getTasks()


}