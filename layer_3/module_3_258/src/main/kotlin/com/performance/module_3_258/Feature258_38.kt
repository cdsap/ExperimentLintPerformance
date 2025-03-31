package com.performance.module_3_258

class Feature258UseCase2(
    private val repository: Feature258Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
