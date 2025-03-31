package com.performance.module_3_264

class Feature264UseCase1(
    private val repository: Feature264Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
