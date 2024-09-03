package com.example.qrscanjc

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao // дата аксес объект показывает как мы доступ к данным с бд, те как мы их записываем, как мы их получаем итд
interface Dao {
    @Insert
    suspend fun insertProduct(product: Product) //корутина фуекция добавить

    @Update
    suspend fun updateProduct(product: Product) //корутина фуекция

    @Query("SELECT * FROM products")// флоу запрос
    fun getAllProducts() : Flow<List<Product>> // список из объектов будет хранится во флоу

    @Query("SELECT * FROM products WHERE numberQR = :qr")
    fun getProductByQr(qr: String) : Product?
}