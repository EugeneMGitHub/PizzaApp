package com.example.pizzaapp.di

import android.app.Application
import androidx.room.Room


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//@Module
//@InstallIn(SingletonComponent::class)
//
//object DatabaseModule {
//
//    @Provides
//    @Singleton
//    fun provideAppDataBase(app: Application): AppDatabase {
//        return Room.databaseBuilder(
//            app,
//            AppDatabase::class.java,
//            "app_database"
//        )
////            .addTypeConverter()
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideDataBaseRepository(db: AppDatabase): DatabaseRepository {
//        return DatabaseRepositoryImpl(db.databaseDao)
//    }
//
//}