package com.performance.module_4_276

class Feature276UseCase2(
    private val repository: Feature276Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
