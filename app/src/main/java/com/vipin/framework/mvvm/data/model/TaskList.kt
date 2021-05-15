package com.vipin.framework.mvvm.data.model

import com.google.gson.annotations.SerializedName

data class TaskList(

	@field:SerializedName("imageUrl")
	val imageUrl: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("TaskList")
	val taskList: List<TaskListItem?>? = null
)

data class Location(

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("lng")
	val lng: Double? = null,

	@field:SerializedName("lat")
	val lat: Double? = null
)

data class TaskListItem(

	@field:SerializedName("imageUrl")
	val imageUrl: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("id")
	val id: Int? = null
)
