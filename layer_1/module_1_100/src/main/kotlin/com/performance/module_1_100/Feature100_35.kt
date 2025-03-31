package com.performance.module_1_100

class Feature100UseCase1(
    private val repository: Feature100Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
