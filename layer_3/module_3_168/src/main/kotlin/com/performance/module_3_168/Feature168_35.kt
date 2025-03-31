package com.performance.module_3_168

class Feature168UseCase1(
    private val repository: Feature168Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
