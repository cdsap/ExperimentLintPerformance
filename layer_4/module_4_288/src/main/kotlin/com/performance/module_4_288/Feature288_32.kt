package com.performance.module_4_288

class Feature288UseCase0(
    private val repository: Feature288Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
