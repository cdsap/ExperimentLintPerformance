package com.performance.module_3_176

class Feature176UseCase0(
    private val repository: Feature176Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
