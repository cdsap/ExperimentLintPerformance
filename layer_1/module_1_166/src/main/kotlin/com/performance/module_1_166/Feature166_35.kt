package com.performance.module_1_166

class Feature166UseCase1(
    private val repository: Feature166Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
