package com.performance.module_3_259

class Feature259UseCase0(
    private val repository: Feature259Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
