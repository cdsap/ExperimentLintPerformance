package com.performance.module_4_288

class Feature288UseCase2(
    private val repository: Feature288Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
