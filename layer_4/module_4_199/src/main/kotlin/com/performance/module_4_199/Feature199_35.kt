package com.performance.module_4_199

class Feature199UseCase1(
    private val repository: Feature199Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
