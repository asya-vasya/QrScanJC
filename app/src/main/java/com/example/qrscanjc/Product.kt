package com.example.qrscanjc

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) // идентификатор каждого энтити
    val id: Int?= null,
    val name: String,
    val numberQR: String,
    val isChecked: Boolean = false
)
