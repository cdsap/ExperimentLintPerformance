package com.performance.module_3_264

class Feature264UseCase0(
    private val repository: Feature264Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
