package com.performance.module_3_264

class Feature264UseCase2(
    private val repository: Feature264Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
