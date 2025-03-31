package com.performance.module_1_194

class Feature194UseCase0(
    private val repository: Feature194Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
