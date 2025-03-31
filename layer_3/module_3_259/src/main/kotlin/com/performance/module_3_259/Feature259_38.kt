package com.performance.module_3_259

class Feature259UseCase2(
    private val repository: Feature259Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
