package com.performance.module_0_72

class Feature72UseCase1(
    private val repository: Feature72Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
