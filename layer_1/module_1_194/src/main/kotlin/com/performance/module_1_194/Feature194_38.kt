package com.performance.module_1_194

class Feature194UseCase2(
    private val repository: Feature194Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
