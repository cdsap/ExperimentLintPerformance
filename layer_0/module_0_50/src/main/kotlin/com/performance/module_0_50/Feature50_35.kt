package com.performance.module_0_50

class Feature50UseCase1(
    private val repository: Feature50Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
