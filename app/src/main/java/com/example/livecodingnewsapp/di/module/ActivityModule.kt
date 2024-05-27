package com.example.livecodingnewsapp.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.livecodingnewsapp.data.repository.TopHeadlineRepository
import com.example.livecodingnewsapp.di.ActivityContext
import com.example.livecodingnewsapp.ui.base.ViewModelProviderFactory
import com.example.livecodingnewsapp.ui.topheadline.TopHeadlineAdapter
import dagger.Module
import dagger.Provides
import com.example.livecodingnewsapp.ui.topheadline.TopHeadlineViewModel


@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideNewsListViewModel(topHeadlineRepository: TopHeadlineRepository): TopHeadlineViewModel {
        return ViewModelProvider(activity,
            ViewModelProviderFactory(TopHeadlineViewModel::class) {
                TopHeadlineViewModel(topHeadlineRepository)
            })[TopHeadlineViewModel::class.java]
    }

    @Provides
    fun provideTopHeadlineAdapter() = TopHeadlineAdapter(ArrayList())

}