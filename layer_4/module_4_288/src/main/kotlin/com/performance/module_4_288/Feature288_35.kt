package com.performance.module_4_288

class Feature288UseCase1(
    private val repository: Feature288Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
