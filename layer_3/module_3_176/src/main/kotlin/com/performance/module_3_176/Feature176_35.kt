package com.performance.module_3_176

class Feature176UseCase1(
    private val repository: Feature176Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
