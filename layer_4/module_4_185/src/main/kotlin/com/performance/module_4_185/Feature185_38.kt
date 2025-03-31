package com.performance.module_4_185

class Feature185UseCase2(
    private val repository: Feature185Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
