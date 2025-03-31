package com.performance.module_1_194

class Feature194UseCase1(
    private val repository: Feature194Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
