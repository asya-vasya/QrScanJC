package com.example.qrscanjc

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn (SingletonComponent::class) //инициализируем нашу бд
object Module {
    @Provides
    @Singleton
    fun provideDb(app:Application) : MainDb {
        return Room.databaseBuilder(
            app, // context
            MainDb::class.java, //как будет выглядеть бд
            "products.db"
        ).build()
    }
}