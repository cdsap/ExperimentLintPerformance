package com.performance.module_1_185

class Feature185UseCase1(
    private val repository: Feature185Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
