package com.performance.module_3_259

class Feature259UseCase1(
    private val repository: Feature259Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
