package com.example.livecodingnewsapp.di.component

import android.content.Context
import com.example.livecodingnewsapp.NewsApplication
import com.example.livecodingnewsapp.data.api.NetworkService
import com.example.livecodingnewsapp.data.repository.TopHeadlineRepository
import com.example.livecodingnewsapp.di.ApplicationContext
import com.example.livecodingnewsapp.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: NewsApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository
}