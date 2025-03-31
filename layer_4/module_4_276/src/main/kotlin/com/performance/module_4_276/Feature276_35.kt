package com.performance.module_4_276

class Feature276UseCase1(
    private val repository: Feature276Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
