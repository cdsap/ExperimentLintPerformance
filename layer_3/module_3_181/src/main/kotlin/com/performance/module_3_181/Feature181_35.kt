package com.performance.module_3_181

class Feature181UseCase1(
    private val repository: Feature181Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
