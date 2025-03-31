package com.performance.module_1_181

class Feature181UseCase1(
    private val repository: Feature181Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
