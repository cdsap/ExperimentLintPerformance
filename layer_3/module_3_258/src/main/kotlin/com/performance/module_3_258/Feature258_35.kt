package com.performance.module_3_258

class Feature258UseCase1(
    private val repository: Feature258Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
