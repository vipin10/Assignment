package com.vipin.framework.mvvm.ui.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vipin.framework.mvvm.data.model.TaskList
import com.vipin.framework.mvvm.data.model.User
import com.vipin.framework.mvvm.data.repository.MainRepository
import com.vipin.framework.mvvm.utils.Resource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    private val users = MutableLiveData<Resource<List<User>>>()
    private val taskList = MutableLiveData<Resource<List<TaskList>>>()

    private val compositeDisposable = CompositeDisposable()

    init {
        fetchTaskList()
    }

   /* private fun fetchUsers() {
        users.postValue(Resource.loading(null))
        compositeDisposable.add(
            mainRepository.getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ userList ->
                    users.postValue(Resource.success(userList))
                }, { throwable ->
                    users.postValue(Resource.error("Something Went Wrong", null))
                })
        )
    }*/


    private fun fetchTaskList() {
        taskList.postValue(Resource.loading(null))
        compositeDisposable.add(
            mainRepository.getTasks()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ userList ->
                    taskList.postValue(Resource.success(userList))
                }, { throwable ->
                    taskList.postValue(Resource.error("Something Went Wrong", null))
                })
        )
    }



    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

    fun getUsers(): LiveData<Resource<List<User>>> {
        return users
    }

    fun getTaskList(): LiveData<Resource<List<TaskList>>> {
        return taskList
    }

}