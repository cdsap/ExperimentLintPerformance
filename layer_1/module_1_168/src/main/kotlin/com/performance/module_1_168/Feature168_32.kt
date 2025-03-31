package com.performance.module_1_168

class Feature168UseCase0(
    private val repository: Feature168Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
