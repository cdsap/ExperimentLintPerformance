package com.performance.module_3_166

class Feature166UseCase2(
    private val repository: Feature166Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
