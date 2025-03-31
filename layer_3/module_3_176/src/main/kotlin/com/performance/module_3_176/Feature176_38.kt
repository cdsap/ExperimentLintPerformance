package com.performance.module_3_176

class Feature176UseCase2(
    private val repository: Feature176Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
