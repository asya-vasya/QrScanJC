package com.example.qrscanjc

import androidx.room.Database
import androidx.room.RoomDatabase

//абстрактный класс, в котором описываем как будет выглядеть база данных

@Database(
    entities = [Product::class], // entities - дата классы с помощью которых мы записываем в таблицу
    version = 1
)
abstract class MainDb : RoomDatabase () {
    abstract val dao: Dao
}