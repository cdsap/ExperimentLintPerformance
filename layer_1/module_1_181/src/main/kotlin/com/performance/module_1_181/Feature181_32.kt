package com.performance.module_1_181

class Feature181UseCase0(
    private val repository: Feature181Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
