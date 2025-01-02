package org.example.kmp.di


import org.example.kmp.dependencies.MyRepository
import org.example.kmp.dependencies.MyRepositoryImpl
import org.example.kmp.dependencies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module
val sharedModule = module {
    viewModelOf(::MyViewModel)
    singleOf(::MyRepositoryImpl).bind<MyRepository>()
    // single { MyRepositoryImpl(get()) }.bind<MyRepository>()

}