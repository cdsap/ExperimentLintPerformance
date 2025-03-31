package com.performance.module_1_22

class Feature22UseCase1(
    private val repository: Feature22Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
