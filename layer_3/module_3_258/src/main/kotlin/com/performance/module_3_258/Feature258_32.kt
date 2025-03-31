package com.performance.module_3_258

class Feature258UseCase0(
    private val repository: Feature258Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
