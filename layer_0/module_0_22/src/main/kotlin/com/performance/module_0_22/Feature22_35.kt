package com.performance.module_0_22

class Feature22UseCase1(
    private val repository: Feature22Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
