package com.performance.module_4_276

class Feature276UseCase0(
    private val repository: Feature276Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
