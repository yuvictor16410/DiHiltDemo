package com.example.hiltpractise01

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ScreenModule {
    @Provides
    fun provideRepository(calculation: Calculation): Repository{
        return Repository(calculation)
    }

    @Provides
    fun provideScreenViewModel(repository: Repository): ScreenViewModel {
        return ScreenViewModel(repository)

    }
}