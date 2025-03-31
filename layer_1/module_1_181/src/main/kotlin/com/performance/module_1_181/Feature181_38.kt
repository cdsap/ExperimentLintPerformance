package com.performance.module_1_181

class Feature181UseCase2(
    private val repository: Feature181Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
