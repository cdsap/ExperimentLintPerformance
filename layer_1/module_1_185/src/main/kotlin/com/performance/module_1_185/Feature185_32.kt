package com.performance.module_1_185

class Feature185UseCase0(
    private val repository: Feature185Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
