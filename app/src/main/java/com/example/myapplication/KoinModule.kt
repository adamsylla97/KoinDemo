package com.example.myapplication

import org.koin.dsl.module

object KoinModule {

    val applicationModule = module {
        single { Class1() }
        single { Class2() }

        single { TestPresenter(get(), get()) }
        single { TestPresenterInJava(get(), get()) }
    }

}