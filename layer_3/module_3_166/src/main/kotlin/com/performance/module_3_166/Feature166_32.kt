package com.performance.module_3_166

class Feature166UseCase0(
    private val repository: Feature166Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
