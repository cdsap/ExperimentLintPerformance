package com.performance.module_1_168

class Feature168UseCase2(
    private val repository: Feature168Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
