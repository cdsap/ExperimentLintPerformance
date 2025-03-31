package com.performance.module_3_50

class Feature50UseCase1(
    private val repository: Feature50Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
